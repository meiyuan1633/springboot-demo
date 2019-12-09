package com.wei.springboot.dynamic;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;


@SpringBootApplication(exclude =DruidDataSourceAutoConfigure.class)
@MapperScan("com.wei.springboot.dynamic.mapper")
public class DynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicApplication.class, args);
    }

}
