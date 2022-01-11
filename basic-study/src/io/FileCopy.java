package io;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int readTimes = 0;
        try {
            fileInputStream = new FileInputStream("E:\\github\\java_study\\demo.jpg");
            fileOutputStream = new FileOutputStream("E:\\github\\java_study\\demo1.jpg");
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
                System.out.println(readLen);
                readTimes++;
            }
            File file = new File("E:\\github\\java_study\\demo.jpg");
            System.out.println("file.length()" + file.length());
            System.out.println("file.length()" + file.length()/1024);
            System.out.println("读取次数" + readTimes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
