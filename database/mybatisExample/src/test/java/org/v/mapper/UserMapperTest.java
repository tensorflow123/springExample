package org.v.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.v.User;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    /**
     * Mybatis给我们封装了驱动加载、连接建立、SQL执行及结果集的映射
     */
    @Test
    void getById() {
        String resource = "mybatis.xml";

        try {
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);

            SqlSession sqlSession = sqlSessionFactory.openSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1);
            System.out.println(new ObjectMapper().writeValueAsString(user));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}