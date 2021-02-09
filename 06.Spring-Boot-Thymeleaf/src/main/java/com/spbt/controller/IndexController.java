package com.spbt.controller;

import com.spbt.pojo.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Index.
 *
 * @author zcb 2021/2/8
 */

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index(Model m) {
        log.info("开始");
        List<Account> list = new ArrayList<Account>();
        list.add(new Account("KangKang", "康康", "e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
        list.add(new Account("Mike", "麦克", "e10adc3949ba59abbe56e", "管理员", "13444444444"));
        list.add(new Account("Jane", "简", "e10adc3949ba59abbe56e", "运维人员", "18666666666"));
        list.add(new Account("Maria", "玛利亚", "e10adc3949ba59abbe56e", "清算人员", "19999999999"));
        m.addAttribute("accountList", list);
        return "account";
    }

    @GetMapping("/test")
    @ResponseBody
    public String getString() {
        return "test";
    }
}
