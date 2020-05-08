package com.joker.classbooking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.joker.classbooking.*.mapper")
@SpringBootApplication
public class ClassbookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassbookingApplication.class, args);
    }

}
