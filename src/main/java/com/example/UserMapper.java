package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by chenguoliang on 2016/10/6.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name")String name);
}
