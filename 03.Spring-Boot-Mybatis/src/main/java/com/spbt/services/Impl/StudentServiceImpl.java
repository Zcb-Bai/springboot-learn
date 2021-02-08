package com.spbt.services.Impl;

import com.spbt.dao.StudentDao;
import com.spbt.pojo.Student;
import com.spbt.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生接口实现类.
 *
 * @author zcb 2021/2/4
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student selectBySid(String sid) {
        return studentDao.selectStudentById(sid);
    }

}
