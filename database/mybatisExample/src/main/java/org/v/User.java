package org.v;

import lombok.Data;

import java.io.Serializable;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}
