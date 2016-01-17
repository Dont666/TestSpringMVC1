package com.sample.demo2.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 这是�?个用传统方法的jdbc工具�?
 * @author admin
 *
 */
public class DBUtil {
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hibernate";
			String user="root";
			String password="1234";
			conn=(Connection)DriverManager.getConnection(url, user, password);
			if(conn!=null)
			{
				return conn;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
