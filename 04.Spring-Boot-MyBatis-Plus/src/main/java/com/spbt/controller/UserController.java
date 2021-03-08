package com.spbt.controller;

import com.spbt.mapper.UserMapper;
import com.spbt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制类.
 *
 * @author zcb 2021/2/4
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;



    @GetMapping()
    public void getById() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @GetMapping("getById/{id}")
    public User getById(@PathVariable("id") Long id) {

        return userMapper.selectById(id);
    }
}
