package com.spring.proxy;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDao dao = new UserDaoImpl();
        UserDao userDao = (UserDao) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), interfaces, new MyInvocationHandler(dao));
        userDao.add(1, 2);
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前执行" + method.getName() + Arrays.toString(args));
        Object res = method.invoke(object, args);
        System.out.println("方法执行后执行" + res);
        return res;
    }
}
