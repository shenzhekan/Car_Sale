package com.szk.dao;

import com.szk.vo.User;

public interface IUserDao {

	/**
	 * �����˺š�����ʵ�ֵ�¼У�飬��ȡ�û���
	 * @param user
	 * @return
	 */
	public User findWithUserIdAndPassword(String userId,String password);

}
