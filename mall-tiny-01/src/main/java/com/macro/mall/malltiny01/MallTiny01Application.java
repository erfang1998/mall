package com.macro.mall.malltiny01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTiny01Application {

    public static void main(String[] args) {
        System.out.println("Hello world");
        SpringApplication.run(MallTiny01Application.class, args);
        System.out.println("args = " + args);

    }
    //第一行
}
