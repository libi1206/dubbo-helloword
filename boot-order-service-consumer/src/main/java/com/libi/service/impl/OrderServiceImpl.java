package com.libi.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.libi.bean.UserAddress;
import com.libi.service.OrderService;
import com.libi.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author libi
 */
@Component("orderService")
public class OrderServiceImpl implements OrderService {
    @Reference(
            interfaceClass = com.libi.service.UserService.class,
            stub = "com.libi,service.UserServiceStub"
    )
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        //需要查询用户收获地址
        List<UserAddress> list = userService.getUserAddressList(userId);
        System.out.println(list);
        return list;
    }
}
