package com.lr.common.ms.service.dao;

import com.lr.common.ms.service.entity.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MiaoshaUserDao {
	
	@Select("select * from ms_user where id = #{id}")
	public MiaoshaUser getById(@Param("id") long id);

	@Update("update ms_user set password = #{password} where id = #{id}")
	public void update(MiaoshaUser toBeUpdate);
}
