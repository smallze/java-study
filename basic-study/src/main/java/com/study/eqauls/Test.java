package com.study.eqauls;

/**
 * @author zzs
 * @date 2021/7/3 11:18
 */
public class Test {
    /**
     * 可拓展下new String 和 直接赋值的区别
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2;
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
