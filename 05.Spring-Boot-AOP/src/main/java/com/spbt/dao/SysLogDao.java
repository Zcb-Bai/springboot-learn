package com.spbt.dao;

import com.spbt.pojo.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 保存日志接口.
 *
 * @author zcb 2021/2/7
 */
@Component
@Mapper
public interface SysLogDao {
    void savaSysLog(SysLog sysLog);
}
