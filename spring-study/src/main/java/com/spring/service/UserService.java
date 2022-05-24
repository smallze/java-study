package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void add(int a, int b) {
        System.out.println("方法执行中...");
    }
}
