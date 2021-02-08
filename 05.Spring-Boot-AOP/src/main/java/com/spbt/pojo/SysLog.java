package com.spbt.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志实体.
 *
 * @author zcb 2021/2/7
 */
@ToString
@Data
public class SysLog implements Serializable {

    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}
