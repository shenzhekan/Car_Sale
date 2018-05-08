package com.szk.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.szk.vo.User;

public interface UserMapper {

	/**
	 * ���ݵ�¼�˺ź������ѯ�û�
	 * @param userId
	 * @param password
	 * @return
	 */
	@Select("select userId,password,userName from user where userId=#{userId} and password=#{password}")
	public User findWithUserIdAndPassword(
			@Param("User_Id") String userId,
			@Param("Password") String password);
	
}
