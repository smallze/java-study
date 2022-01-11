package com.study.jihe.list_;

import java.util.List;
import java.util.Vector;

/**
 * @author zzs
 * @date 2021/7/6 10:54
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 1; i <= 10 ; i++) {
            vector.add(i);
        }
        for (int i = 11; i <= 15 ; i++) {
            vector.add(i);
        }
    }
}
