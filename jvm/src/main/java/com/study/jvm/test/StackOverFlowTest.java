package com.study.jvm.test;

/**
 * @author zzs
 * @date 2022/5/1 11:39
 */
public class StackOverFlowTest {

    private static int i = 0;

    public static void main(String[] args) {
        System.out.println(i++); // 9851 设置jvm栈大小-Xss256k 变为2229
        main(args);
    }
}
