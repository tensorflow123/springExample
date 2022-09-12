package org.v.mybatisspringexample.mapper;

import org.v.mybatisspringexample.User;

/**
 * UserMapper.xml中的namespace需要对应包名org.v.mybatisspringexample.mapper.UserMapper
 */
public interface UserMapper {
    User getUserById(int id);
}
