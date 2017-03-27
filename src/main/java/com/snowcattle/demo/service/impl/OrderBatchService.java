package com.snowcattle.demo.service.impl;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.mapper.OrderMapper;
import com.snowcattle.demo.sharding.CustomerContextHolder;
import com.snowcattle.demo.sharding.DataSourceType;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangwenping on 17/3/27.
 */
@Service
public class OrderBatchService{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public final SqlSession getBatchSqlSession() {
        return new SqlSessionTemplate(this.sqlSessionTemplate.getSqlSessionFactory(), ExecutorType.BATCH);
    }

    public void insertBatch(List<Order> orderList){
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, true);
        for (Order order:orderList) {
            CustomerContextHolder.setCustomerType(CustomerContextHolder.getShardingDBKeyByUserId(DataSourceType.jdbc_player_db, order.getUserId()));
            order.setSharding_table_index(CustomerContextHolder.getShardingDBTableIndexByUserId(order.getUserId()));
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            orderMapper.insertOrder(order);
        }

        sqlSession.commit();
        sqlSession.close();
    }

}
