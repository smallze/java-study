package com.test.gcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcDemoApplication.class, args);
        runOOM();
    }

    /**
     * 内存溢出方法
     */
    private static void runOOM() {
        List<GcDemoApplication> list = new ArrayList<>();
        while (true) {
            System.out.println("add...");
            list.add(new GcDemoApplication());
        }
    }

}
