package org.v.configureexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * 1. ConfigurationProperties
 * 2. ConfigurationPropertiesScan， 和EnableConfigurationProperties的区别是，可以扫描指定包名下的配置
 */
@Data
@ConfigurationProperties(prefix = "mail")
public class ConfigureScanProperties {
    private String hostname;
}
