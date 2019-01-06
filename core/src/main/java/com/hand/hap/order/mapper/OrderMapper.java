package com.hand.hap.order.mapper;

import com.hand.hap.order.dto.Order;

import java.util.List;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description ${description}
 * @date 2018/12/29
 */
public interface OrderMapper {
    List<Order> selectCollect(Order order);
    List<Order> selectCollect2(Order order);
    List<Order> selectCollect3(Order order);
    int deleteOrder (Order order);
}
