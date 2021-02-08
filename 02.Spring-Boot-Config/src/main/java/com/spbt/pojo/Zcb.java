package com.spbt.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * zcb实体类.
 *
 * @author zcb 2021/2/2
 */
@Component
@Data
public class Zcb {

    @Value("${zcb.name}")
    private String name;

    @Value("${zcb.title}")
    private String title;

}
