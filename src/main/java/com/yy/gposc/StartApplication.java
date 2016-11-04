package com.yy.gposc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring Java Config的标识
@Configuration
//Spring 默认扫描ClassPath中的Component，以本类所在地package为起点。
@ComponentScan()
@EnableAutoConfiguration
//@EnableWebMvc
public class StartApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}