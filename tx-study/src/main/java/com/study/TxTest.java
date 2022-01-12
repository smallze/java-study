package com.study;

import com.study.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzs
 * @date 2022/1/11 19:24
 */
public class TxTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.transferMoney();
    }
}
