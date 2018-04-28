package com.firebird.mybatis.mapper;

import com.firebird.mybatis.po.Orders;
import com.firebird.mybatis.po.OrdersCustom;

import java.util.List;

/**
 * @program:
 * @description: 订单用户Mapper
 * @author: Mr.Wu
 * @create: --
 **/
public interface OrdersMapperCustom {
    public List<OrdersCustom> findOrdersUser() throws Exception;

    public List<Orders> findOrdersUserResultMap() throws Exception;
}


