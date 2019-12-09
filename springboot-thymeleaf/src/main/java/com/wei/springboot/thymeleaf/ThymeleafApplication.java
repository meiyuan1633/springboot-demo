package com.wei.springboot.thymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @SpringBootApplication =@SpringBootConfiguration
*                         +@EnableAutoConfiguration(自动配置文件的收集器)
*                          +@ConfigurationPropertiesScan
* */
@SpringBootApplication()
@MapperScan("com.wei.springboot.thymeleaf.mapper")
public class ThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

}
