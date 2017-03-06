package com.snowcattle.demo.service.impl;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.mapper.OrderMapper;
import com.snowcattle.demo.sharding.CustomerContextHolder;
import com.snowcattle.demo.sharding.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiangwenping on 17/3/6.
 */
@Service
public class OrderService{

    @Autowired
    private OrderMapper orderMapper;

    public int insertOrder(Order order) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.getShardingDBKeyByUserId(DataSourceType.jdbc_player_db, order.getUserId()));
        order.setSharding_table_index(CustomerContextHolder.getShardingDBTableIndexByUserId(order.getUserId()));
        return orderMapper.insertOrder(order);
    }
}
