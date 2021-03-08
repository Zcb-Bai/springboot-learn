package com.spbt.dao;

import com.spbt.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 数据操作.
 *
 * @author zcb 2021/2/4
 */
@Component
@Mapper
public interface StudentDao {

//    @Select("select * from student where sid = #{sid}")
//    @Results( id = "student", value = {
//            @Result(property = "sid", column = "sid", javaType = String.class),
//            @Result(property = "sname", column = "sname", javaType = String.class),
//            @Result(property = "sex", column = "sex", javaType = String.class)
//    })
    Student selectStudentById(String sid);


}
