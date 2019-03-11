package com.libi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.libi.bean.UserAddress;
import com.libi.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author libi
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userID) {
        UserAddress userAddress1 = new UserAddress(1, "成都市八宝街", userID, "詹艳", "13438361366", "Y");
        UserAddress userAddress2 = new UserAddress(2, "杭州市浙江科技学院", userID, "李比", "15336534157", "Y");
        return Arrays.asList(userAddress1, userAddress2);
    }
}
