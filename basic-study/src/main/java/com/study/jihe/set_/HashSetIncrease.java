package com.study.jihe.set_;

import java.util.HashSet;

/**
 * @author zzs
 * @date 2021/7/8 8:53
 */
public class HashSetIncrease {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int i = 0; i < 23; i++) {
            set.add(new A(i));
        }
        set.add(new A(23));
        set.add(new A(24));
        set.add(new A(25));
        System.out.println(set);

    }




}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

//    @Override
//    public int hashCode() {
//        return 100;
//    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}
