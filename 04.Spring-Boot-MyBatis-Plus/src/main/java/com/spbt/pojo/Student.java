package com.spbt.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcb
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Student extends Model {

    private static final long serialVersionUID = 1L;

    private String sid;

    private String sname;

    private String sex;


}
