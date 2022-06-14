package com.dhee.card;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.dhee.card.Mapper")
public class DheeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DheeApplication.class, args);
    }

}
