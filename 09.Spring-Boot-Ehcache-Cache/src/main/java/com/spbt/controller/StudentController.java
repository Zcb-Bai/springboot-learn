package com.spbt.controller;

import com.spbt.pojo.Student;
import com.spbt.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生控制器.
 *
 * @author zcb 2021/2/4
 */
@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("getStudent/{sid}")
    public Student getOneStu(@PathVariable(value = "sid") String sid) {
        Student student = studentService.selectBySid(sid);
        log.info("学生信息" + student);
        return student;
    }

    @GetMapping("/")
    public String getString() {
        return "true";
    }
}
