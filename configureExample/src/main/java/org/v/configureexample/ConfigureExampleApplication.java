package org.v.configureexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.v.configureexample.config.SimpleProperties;

@SpringBootApplication
//@EnableConfigurationProperties(SimpleProperties.class)
@ConfigurationPropertiesScan("org.v.configureexample.config")
public class ConfigureExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigureExampleApplication.class, args);
    }

}
