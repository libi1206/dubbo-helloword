package com.libi.service;

import com.libi.bean.UserAddress;

import java.util.List;

/**
 * @author libi
 */
public interface UserService {
    /**
     * 根据用户id返回地址
     * @param userID
     * @return
     */
    List<UserAddress> getUserAddressList(String userID);
}
