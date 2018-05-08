package com.szk.dao;

import com.szk.vo.User;

public interface IUserDao {

	/**
	 * 根据账号、密码实现登录校验，获取用户名
	 * @param user
	 * @return
	 */
	public User findWithUserIdAndPassword(String userId,String password);

}
