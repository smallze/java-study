package com.study.jvm.test;

/**
 * @author zzs
 * @date 2022/4/28 22:09
 */
public class ClassInit2 {

    public static void main(String[] args) {
        System.out.println(Son.b);
    }

}

class Father {
    static int a = 100;

    static {
        a = 200;
    }
}

class Son extends Father {
    public static int b = a;
}