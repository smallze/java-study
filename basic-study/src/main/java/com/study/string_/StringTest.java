package com.study.string_;

/**
 * @author zzs
 * @date 2021/7/3 15:12
 */
public class StringTest {

    public static void main(String[] args) {
        handleString();
        handleStringBuilder();
        handleStringBuffer();
    }

    static void handleString() {
        long startTime = System.currentTimeMillis();
        String str = "love u";
        for (int i = 0; i < 30000; i++) {
            str += "love u";
        }
        long costTime = System.currentTimeMillis() - startTime;
        System.out.println("30000 string cost time" + costTime);
    }


    static void handleStringBuilder() {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("love u");
        for (int i = 0; i < 300_0000; i++) {
            stringBuilder.append("love u");
        }
        long costTime = System.currentTimeMillis() - startTime;
        System.out.println("3000000 stringBuilder cost time" + costTime);
    }

    static void handleStringBuffer() {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("love u");
        for (int i = 0; i < 300_0000; i++) {
            stringBuffer.append("love u");
        }
        long costTime = System.currentTimeMillis() - startTime;
        System.out.println("3000000 stringBuffer cost time" + costTime);
    }


}
