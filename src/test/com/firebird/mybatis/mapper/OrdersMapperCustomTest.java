package com.firebird.mybatis.mapper; 

import com.firebird.mybatis.po.Orders;
import com.firebird.mybatis.po.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

/** 
* OrdersMapperCustom Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 27, 2018</pre> 
* @version 1.0 
*/ 
public class OrdersMapperCustomTest { 

    private SqlSessionFactory sessionFactory;

@Before
public void before() throws Exception {
    String resource = "SqlMapConfig.xml";
    InputStream inputStream= Resources.getResourceAsStream(resource);
    sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findOrdersUser() 
* 
*/ 
@Test
public void testFindOrdersUser() throws Exception { 
    SqlSession sqlSession=sessionFactory.openSession();
    OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
    List<OrdersCustom> list= ordersMapperCustom.findOrdersUser();
    System.out.println(list.size());

}


@Test
public void testFindOrdersUserResultMap() throws Exception {
    SqlSession sqlSession=sessionFactory.openSession();
    OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
    List<Orders> list= ordersMapperCustom.findOrdersUserResultMap();
    System.out.println(list);

}

} 
