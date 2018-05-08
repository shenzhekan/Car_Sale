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
	 * �Զ�ע��UserMapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * ��¼У��
	 */
	@Override
	public User login(String userId, String password) {
		
		User user = userMapper.findWithUserIdAndPassword(userId, password);
		
		return user;
	}
	

}
