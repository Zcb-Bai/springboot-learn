package com.spbt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类.
 *
 * @author zcb 2021/2/1
 */

@RestController
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    String index() {
        return "hello spring boot";
    }


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
