package com.spbt.services;

import com.spbt.pojo.Student;
import org.springframework.stereotype.Service;

/**
 * 学生接口.
 *
 * @author zcb 2021/2/4
 */
@Service
public interface StudentService {

    Student selectBySid(String sid);
}
