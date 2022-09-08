package org.v.configureexample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.v.configureexample.bean.Item;

/**
 * 1.1 Configuration 声明为配置类，BeanProperties被spring管理
 *
 * 1.2.1 Bean，让spring管理声明周期
 * 1.2.2 ConfigurationProperties需要配置，否则无法找到配置
 */
@Configuration
public class BeanProperties {

    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item item() {
        return new Item();
    }
}
