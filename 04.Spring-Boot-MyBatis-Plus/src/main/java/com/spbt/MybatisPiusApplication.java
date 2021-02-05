package com.spbt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类.
 *
 * @author zcb 2021/2/4
 */
@SpringBootApplication
@MapperScan("com.spbt.mapper")
public class MybatisPiusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPiusApplication.class, args);
    }
}
