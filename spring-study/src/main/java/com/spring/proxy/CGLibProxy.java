package com.spring.proxy;


import com.spring.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy {

    public static void main(String[] args) {
        UserService userService = new UserService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());
        MyMethodInterceptor<UserService> userServiceMyMethodInterceptor = new MyMethodInterceptor<UserService>(userService);
        enhancer.setCallback(userServiceMyMethodInterceptor);
        UserService userService1 = (UserService) enhancer.create();
        userService1.add(2,3);
    }
}

class MyMethodInterceptor<T> implements MethodInterceptor {

    private T target;

    public MyMethodInterceptor(T target) {
        this.target = target;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前...." + method.getName());
        Object res = method.invoke(target, objects);
        System.out.println("方法执行后...." + res);
        return res;
    }
}