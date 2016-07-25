package com.derun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		query() ;
	}
	
	private static void query() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// º”‘ÿOracle«˝∂Ø≥Ã–Ú
			String url = "jdbc:oracle:thin:@192.168.109.129:1521:orcl";
			String user = "sys as sysdba";
			String password = "wbzhao";			
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "select username from dba_users where user_id = ?";
			PreparedStatement pre = conn.prepareStatement(sql);//  µ¿˝ªØ‘§±‡“Î”Ôæ‰
			pre.setInt(1, 55);
			ResultSet rs = pre.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("username"));
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
