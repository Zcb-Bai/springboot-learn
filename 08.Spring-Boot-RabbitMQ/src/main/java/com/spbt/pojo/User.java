package com.spbt.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 信息.
 *
 * @author zcb 2021/2/20
 */
@Data
@Component
@ConfigurationProperties(prefix = "rabbit")
@PropertySource("classpath:rabbitmq.properties")
public class User {

    private String host;
    private Integer port;
    private String userName;
    private String passWord;
}
