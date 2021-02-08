package com.spbt.controller;

import com.spbt.pojo.TestConfig;
import com.spbt.pojo.Zcb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller.
 *
 * @author zcb 2021/2/2
 */
@RestController
public class IndexController {

    @Autowired
    private Zcb zcb;
    @Autowired
    private TestConfig testConfig;

    @GetMapping()
    public String getData() {
        return zcb.getName() + "\t" + zcb.getTitle();
    }

    @GetMapping("test")
    public String getTest() {
        return testConfig.getName() + "\t" + testConfig.getAge();
    }

}
