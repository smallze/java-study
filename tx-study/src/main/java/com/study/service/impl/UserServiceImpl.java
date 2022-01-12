package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.domain.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author zzs
 * @date 2022/1/11 19:22
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transferMoney() {
        User user1 = userDao.getUser(1);
        System.out.println(user1);
        User user2 = userDao.getUser(1);
        System.out.println(user2);
        System.out.println(user1 == user2);
        userDao.reduceMoney(2, new BigDecimal(10));
//        if (true) {
//            throw new RuntimeException("Error");
//        }
        userDao.addMoney(1, new BigDecimal(10));
        User user3 = userDao.getUser(1);
        System.out.println(user3);
        System.out.println(user3 == user2);
    }
}
