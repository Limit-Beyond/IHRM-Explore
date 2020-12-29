package com.ihrm;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.awt.*;

/**
 * @title: com.ihrm.CompanyApplication
 * @Author Tan
 * @Date: 2020/12/29 23:53
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
@EntityScan("com.ihrm")
public class CompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }



}
