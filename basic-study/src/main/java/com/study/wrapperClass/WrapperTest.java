package com.study.wrapperClass;

import org.junit.Test;

/**
 * @author zzs
 * @date 2022/1/11 15:11
 */
public class WrapperTest {

    @Test
    public void test1() {
        int a = 0;
        int b = 0;
        System.out.println("a==b?");
        System.out.println(a == b);
        int c = 128;
        int d = 128;
        System.out.println("c==d?");
        System.out.println(c == d);
        Integer e = 0;
        Integer f = 0;
        System.out.println("e==f?");
        System.out.println(e == f);
        Integer g = 128;
        Integer h = 128;
        System.out.println("g==h?");
        System.out.println(g == h);
        Integer ee = 129;
        Integer ff = 129;
        System.out.println("ee==ff?");
        System.out.println(ee == ff);

        System.out.println("-----------");
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("-----------");

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
        System.out.println("-----------");

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));
        System.out.println("-----------");

        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7 == i8);
        System.out.println(i7.equals(i8));

    }

}
