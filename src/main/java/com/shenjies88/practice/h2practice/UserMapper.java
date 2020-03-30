package com.shenjies88.practice.h2practice;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shenjies88
 * @since 2020/3/30-11:43 PM
 */
public interface UserMapper {

    @Select("select * from user")
    List<UserDo> userList();
}
