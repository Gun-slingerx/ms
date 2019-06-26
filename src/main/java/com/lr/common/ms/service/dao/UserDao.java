package com.lr.common.ms.service.dao;

import com.lr.common.ms.service.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User getNameByID(@Param("id") int id);
}
