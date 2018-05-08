package com.szk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szk.dao.IUserDao;
import com.szk.mapper.UserMapper;
import com.szk.service.IUserService;
import com.szk.vo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	/**
	 * 自动注入UserMapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * 登录校验
	 */
	@Override
	public User login(String userId, String password) {
		
		User user = userMapper.findWithUserIdAndPassword(userId, password);
		
		return user;
	}
	

}
