package com.spbt;

import com.spbt.pojo.TestConfig;
import com.spbt.pojo.ZcbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 启动类.
 *
 * @author zcb 2021/2/2
 */
@SpringBootApplication
@EnableConfigurationProperties({ZcbConfig.class, TestConfig.class})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
