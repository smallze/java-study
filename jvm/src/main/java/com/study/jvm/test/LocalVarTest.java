package com.study.jvm.test;

import java.util.Date;

/**
 * 局部变量表
 *
 * @author zzs
 * @date 2022/5/3 13:45
 */
public class LocalVarTest {

    private int count = 0;

    public static void main(String[] args) {
        LocalVarTest localVarTest = new LocalVarTest();
        int num = 10;
        localVarTest.test1();
    }

    public void test1() {
        Date date = new Date();
        String name = "world";
        String info = test2(date, name);
        System.out.println(date.hashCode());
        System.out.println(date + name);
        System.out.println(info);
    }

    public String test2(Date date, String name) {
        System.out.println(date.hashCode());
        date = null;
        name = "hello";
        double weight = 75.02;
        char gender = '男';
        return date + name;
    }

    public void test3() {
        count++;
    }



}
