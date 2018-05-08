package com.szk.dao.impl;

import javax.enterprise.inject.New;

import org.apache.ibatis.session.SqlSession;

import com.szk.dao.IUserDao;
import com.szk.factory.FKSqlSessionFactory;
import com.szk.vo.User;

public class UserDaoImpl implements IUserDao {

	@Override
	public User findWithUserIdAndPassword(String userId,String password) {
		
		SqlSession sqlSession = FKSqlSessionFactory.getSqlSeesion();
		
		User user2 = sqlSession.selectOne("com.szk.mapper.UserMapper.checkedUser",new User(userId,password));
		
		System.out.println(user2);
		//	提交事务
		sqlSession.commit();
		//	关闭session
		sqlSession.close();
		
		return user2;
	}

}
