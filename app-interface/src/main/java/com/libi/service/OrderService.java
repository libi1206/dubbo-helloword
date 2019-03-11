package com.libi.service;

import com.libi.bean.UserAddress;

import java.util.List;

/**
 * @author libi
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}
