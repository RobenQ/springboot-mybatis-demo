package com.zq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.zq.mapper"})
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
