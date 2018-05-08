package com.szk.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.szk.vo.User;

public interface UserMapper {

	/**
	 * 根据登录账号和密码查询用户
	 * @param userId
	 * @param password
	 * @return
	 */
	@Select("select userId,password,userName from user where userId=#{userId} and password=#{password}")
	public User findWithUserIdAndPassword(
			@Param("User_Id") String userId,
			@Param("Password") String password);
	
}
