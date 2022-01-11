package com.study.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer_ {

    public static void main(String[] args) {

    }

    private void writer1() throws IOException {
        FileWriter fw = new FileWriter("E:\\github\\java_study\\demo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        char[] arr = {
                'a', 'b', 'c', 'd', 'e'
        };
        bw.write(arr, 0, 2);
        bw.newLine();
        bw.write(arr, 2, 2);
        bw.close();
    }
    private void read() throws IOException {
        FileWriter fw = new FileWriter("E:\\github\\java_study\\demo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        char[] arr = new char[2048];
        for (int i = 0; i < 2048; i++) {
            arr[i] = (char) i;
        }
        bw.write(arr, 0, 2);
        bw.newLine();
        bw.write(arr, 2, 2);
        bw.close();
    }
}
