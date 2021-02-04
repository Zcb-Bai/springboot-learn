package com.spbt.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 学生类.
 *
 * @author zcb 2021/2/4
 */
@Data
@Component
public class Student implements Serializable {

    private String sid;
    private String sname;
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
