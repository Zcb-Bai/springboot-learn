package com.spbt.pojo;

import com.spbt.config.YamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 自定义配置文件对应实体类.
 *
 * @author zcb 2021/2/2
 */

@Component
@Data
@ConfigurationProperties(prefix = "test")
//@PropertySource(value = "classpath:test.yml", factory = YamlPropertySourceFactory.class)
@PropertySource("classpath:test.properties")
public class TestConfig {
    private String name;
    private int age;
}
