package com.spbt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类.
 *
 * @author zcb 2021/2/8
 */
@Data
@AllArgsConstructor
public class Account {
    private String account;
    private String name;
    private String password;
    private String accountType;
    private String tel;
}
