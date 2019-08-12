package com.example.xy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xy.mapper")
public class Hrserverpractice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hrserverpractice2Application.class, args);
    }

}
