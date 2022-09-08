package org.v.configureexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.v.configureexample.bean.Credentials;

/**
 * 嵌套对象
 * 扫描的方式
 */
@Data
@ConfigurationProperties(prefix = "country")
public class NestedProperties {
    private String code;

    private Credentials credentials;
}
