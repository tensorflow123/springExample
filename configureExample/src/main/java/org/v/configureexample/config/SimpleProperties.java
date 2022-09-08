package org.v.configureexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 1. ConfigurationProperties
 * 2. 添加@EnableConfigurationProperties(SimpleProperties.class)
 */
@ConfigurationProperties(prefix = "eth")
@Data
public class SimpleProperties {
    private String rpc;
}