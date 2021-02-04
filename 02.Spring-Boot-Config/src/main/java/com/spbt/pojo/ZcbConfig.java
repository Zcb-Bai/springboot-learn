package com.spbt.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 和配置文件对应的实体类.
 *
 * @author zcb 2021/2/2
 */

@ConfigurationProperties(prefix = "zcb")
@Data
public class ZcbConfig {
    private String name;

    private String title;
}
