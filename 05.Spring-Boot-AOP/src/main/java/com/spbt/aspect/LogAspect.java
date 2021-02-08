package com.spbt.aspect;

import com.spbt.annotation.Log;
import com.spbt.dao.SysLogDao;
import com.spbt.pojo.SysLog;
import com.spbt.util.HttpContextUtils;
import com.spbt.util.IPUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 切面.
 *
 * @author zcb 2021/2/7
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Autowired
    private SysLogDao sysLogDao;

    @Pointcut("@annotation(com.spbt.annotation.Log)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint point) {
        long beginTime = System.currentTimeMillis();
        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long time = System.currentTimeMillis() - beginTime;
        saveLog(point, time);
    }

    private void saveLog(ProceedingJoinPoint point, long time) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        SysLog sysLog = new SysLog();
        Log annotation = method.getAnnotation(Log.class);
        //注解上的描述 用户操作
        if (annotation != null) {
            sysLog.setOperation(annotation.value());
        }
        //请求方法名
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLog.setMethod(className + "." + methodName + "()");
        //请求参数
        Object[] args = point.getArgs();
        LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();
        String[] parameterNames = discoverer.getParameterNames(method);
        if (args != null && parameterNames != null) {
            String params = "";
            for (int i = 0; i < args.length; i++) {
                params += " " + parameterNames[i] + ":" + args[i];
            }
            sysLog.setParams(params);
        }
        //获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        //设置ip地址
        sysLog.setIp(IPUtils.getIpAddr(request));
        sysLog.setUsername("zcb");
        sysLog.setTime((int) time);
        sysLog.setCreateTime(new Date());
        // 保存系统日志
        log.info("用户操作信息：{}", sysLog);
        sysLogDao.savaSysLog(sysLog);
    }
}
