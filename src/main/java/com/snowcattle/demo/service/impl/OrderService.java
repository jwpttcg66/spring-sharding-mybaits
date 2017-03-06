package com.snowcattle.demo.service.impl;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.mapper.OrderMapper;
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
        return orderMapper.insertOrder(order);
    }
}
