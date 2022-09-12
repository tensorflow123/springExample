package org.v.mybatisspringexample.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.v.mybatisspringexample.User;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Resource
    UserService userService;

    @Test
    public void getUserById() throws JsonProcessingException {
        User user = userService.getUserById(1);
        System.out.println(new ObjectMapper().writeValueAsString(user));
    }
}