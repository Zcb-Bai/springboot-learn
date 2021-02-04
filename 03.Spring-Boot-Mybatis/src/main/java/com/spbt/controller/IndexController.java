package com.spbt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aa.
 *
 * @author zcb 2021/2/3
 */
@RestController
public class IndexController {

    @GetMapping("")
    public String getA() {
        return "A";
    }
}
