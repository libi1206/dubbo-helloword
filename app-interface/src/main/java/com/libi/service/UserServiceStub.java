package com.libi.service;

import com.libi.bean.UserAddress;
import com.libi.service.UserService;
import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author libi
 */
public class UserServiceStub implements UserService {
    /** 远程代理对象 */
    private UserService userService;

    /** 用于传入远程代理对象 */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userID) {
        System.out.println("调用本地存根");
        if (!StringUtils.isEmpty(userID)) {
            return userService.getUserAddressList(userID);
        }
        return null;
    }
}
