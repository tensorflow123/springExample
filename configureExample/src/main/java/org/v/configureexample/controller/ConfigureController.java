package org.v.configureexample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.v.configureexample.bean.Item;
import org.v.configureexample.config.BeanProperties;
import org.v.configureexample.config.ConfigureScanProperties;
import org.v.configureexample.config.NestedProperties;
import org.v.configureexample.config.SimpleProperties;

@RestController
public class ConfigureController {
    @Autowired
    SimpleProperties simpleProperties;

    @Autowired
    ConfigureScanProperties configureScanProperties;

    @Autowired
    NestedProperties nestedProperties;

    @Autowired
    BeanProperties beanProperties;

    @Autowired
    Item item;

    @GetMapping("simple")
    public String simple() {
        return simpleProperties.getRpc();
    }

    @GetMapping("scan")
    public String scan() {
        return configureScanProperties.getHostname();
    }

    @GetMapping("nest")
    public String nest() {
        return nestedProperties.getCredentials().getAuthMethod();
    }

    @GetMapping("bean")
    public String bean() {
        return beanProperties.item().getName();
    }

    @GetMapping("item")
    public String item() {
        return beanProperties.item().getName();
    }
}
