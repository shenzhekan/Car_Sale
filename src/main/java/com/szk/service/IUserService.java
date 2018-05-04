package com.szk.service;

import com.szk.vo.User;

public interface IUserService {
	
	/**
	 * 通过账户和密码实现登录操作
	 * @param user
	 * @return
	 */
	public User getUserByIdName(User user);

}
