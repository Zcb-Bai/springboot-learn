package com.spbt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcb
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {
        System.out.println(id);
        // throw new RuntimeException("user not exist");
    }
}
