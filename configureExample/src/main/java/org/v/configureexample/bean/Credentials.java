package org.v.configureexample.bean;

import lombok.Data;

@Data
public class Credentials {
    private String authMethod;
    private String username;
    private String password;
}
