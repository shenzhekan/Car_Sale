package com.szk.service.impl;

import org.springframework.stereotype.Service;

import com.szk.dao.IUserDao;
import com.szk.service.IUserService;
import com.szk.vo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	private IUserDao userDao;
	
	@Override
	public User getUserByIdName(User user) {
		
		return this.userDao.checkedUser(user);
	}

}
