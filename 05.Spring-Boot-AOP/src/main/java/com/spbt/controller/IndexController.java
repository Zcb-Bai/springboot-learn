package com.spbt.controller;

import com.spbt.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * index.
 *
 * @author zcb 2021/2/5
 */
@RestController
public class IndexController {

    @Log("执行方法一")
    @GetMapping("/one/{name}")
    public void methodOne(@PathVariable("name") String name) {
    }

    @Log("执行方法二")
    @GetMapping("/two")
    public void methodTwo() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Log("执行方法三")
    @GetMapping("/three/{name}/{age}")
    public void methodThree(String name, String age) {
    }
}
