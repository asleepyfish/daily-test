package com.asleepyfish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author asleepyfish
 */
@SpringBootApplication
@MapperScan(basePackages = "com.asleepyfish")
public class DailyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyTestApplication.class, args);
    }

}
