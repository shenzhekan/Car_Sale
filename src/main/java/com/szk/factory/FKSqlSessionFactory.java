package com.szk.factory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 获得SqlSession的类
 * @author admin
 *
 */
public class FKSqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory = null;
	
	//初始化创建SqlSessionFactory
	static {
		
		try {
			InputStream inputStream = Resources.getResourceAsStream("spring-mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取SqlSession对象的静态方法
	 * @return
	 */
	public static SqlSession getSqlSeesion() {
		return sqlSessionFactory.openSession();
	}
	
	/**
	 * 获取SqlSessionFactory的静态方法
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	

}
