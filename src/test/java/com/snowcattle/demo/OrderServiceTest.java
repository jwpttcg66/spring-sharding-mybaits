package com.snowcattle.demo;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.service.impl.OrderBatchService;
import com.snowcattle.demo.service.impl.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangwenping on 17/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:db_applicationContext.xml")
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderBatchService orderBatchService;

    @Test
    public void test(){


        int startSize = 200000;
        int endSize = startSize + 10;

        List<Order> orderList = new ArrayList<Order>();
        for(int i = startSize; i < endSize; i++){
            Order order = new Order();
            order.setUserId(i);
            order.setId(i);
            order.setStatus("测试插入");
            orderList.add(order);
        }
        orderBatchService.insertBatch(orderList);
    }

    public void testSingle(){
        for(int i = 0; i < 12; i++){
            Order order = new Order();
            order.setUserId(i);
            order.setId(i);
            order.setStatus("测试插入");
            orderService.insertOrder(order);
        }
    }


}
