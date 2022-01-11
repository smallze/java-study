package com.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {

    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        byte[] buf = new byte[2];
        int readLen = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\github\\java_study\\demo.txt");
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
