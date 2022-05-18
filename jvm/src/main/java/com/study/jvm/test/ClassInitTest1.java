package com.study.jvm.test;

/**
 * @author zzs
 * @date 2022/4/28 21:22
 */
public class ClassInitTest1 {

    private static int num = 895;

    static {
        num = 999;
        number = 100;
    }

    private static int number = 200;

    public static void main(String[] args) {
        System.out.println(ClassInitTest1.num);
        System.out.println(ClassInitTest1.number);

    }
}
