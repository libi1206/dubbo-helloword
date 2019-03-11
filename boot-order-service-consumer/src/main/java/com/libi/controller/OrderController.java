package com.libi.controller;

import com.libi.bean.UserAddress;
import com.libi.service.OrderService;
import com.libi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author libi
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }

}
