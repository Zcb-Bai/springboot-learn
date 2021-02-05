package com.spbt.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表.
 *
 * @author zcb 2021/2/4
 */

@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
