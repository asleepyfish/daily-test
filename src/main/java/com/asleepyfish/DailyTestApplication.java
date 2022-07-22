package com.asleepyfish;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author asleepyfish
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.asleepyfish"})
@EnableLeafServer
public class DailyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyTestApplication.class, args);
    }

}
