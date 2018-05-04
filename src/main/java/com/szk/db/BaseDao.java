package com.szk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	private static Connection conn;
	private static String DRIVER = "org.gjt.mm.mysql.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/car_sale";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	static {
		try {
			Class.forName(DRIVER);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 数据库连接
	 */
	private void getConn() {
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected static PreparedStatement pst;
	protected static ResultSet rs;
	
	/**
	 * 关闭连接的方法
	 */
	public void colseAll() {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != pst) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 执行查询语句的基本方法
	 * @param sql
	 * @param params
	 * @return
	 */
	protected ResultSet executeFind(String sql,Object[] params) {
		this.getConn();
		try {
			pst = conn.prepareStatement(sql);
			if(null != params) {
				for(int i = 0; i < params.length ; i++) {
					pst.setObject(i+1, params[i]);
				}
			}
			rs = pst.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * 执行增，删，查，改 的基本方法
	 * 返回受影响的行数
	 * @param sql
	 * @param params
	 * @return
	 */
	protected int executeUpdate(String sql,Object[] params) {
		//返回受影响的行数
		int count = 0;
		this.getConn();
		try {
			pst = conn.prepareStatement(sql);
			if(null != params) {
				for(int i = 0 ; i < params.length ; i++) {
					pst.setObject(i+1, params[i]);
				}
			}
			count = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.colseAll();
		}
		return count;
	}
	
}
