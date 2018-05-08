package com.szk.factory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ���SqlSession����
 * @author admin
 *
 */
public class FKSqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory = null;
	
	//��ʼ������SqlSessionFactory
	static {
		
		try {
			InputStream inputStream = Resources.getResourceAsStream("spring-mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡSqlSession����ľ�̬����
	 * @return
	 */
	public static SqlSession getSqlSeesion() {
		return sqlSessionFactory.openSession();
	}
	
	/**
	 * ��ȡSqlSessionFactory�ľ�̬����
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	

}
