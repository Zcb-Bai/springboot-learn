package com.spbt.service.impl;

import com.spbt.pojo.Student;
import com.spbt.mapper.StudentMapper;
import com.spbt.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcb
 * @since 2021-02-04
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
