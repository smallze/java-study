package com.study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

    public static void main(String[] args) {
        m2();
    }

    public static void m1(){
        FileOutputStream fileOutputStream = null;
        try {
            // 覆盖
            fileOutputStream = new FileOutputStream("E:\\github\\java_study\\demo.txt");
            // 写入一个字节
            //fileOutputStream.write('F');
            // 写入字符串 .getBytes 字符串转字节数组
            String str = "hello world";
            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void m2(){
        FileOutputStream fileOutputStream = null;
        try {
            // 添加
            fileOutputStream = new FileOutputStream("E:\\github\\java_study\\demo.txt",true);
            // 写入一个字节
            //fileOutputStream.write('F');
            // 写入字符串 .getBytes 字符串转字节数组
            String str = "hello world";
            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
