package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex06 {
	String url = "jdbc : oracle : thin: @localhost: 1521:xe";
	String id = "scott";
	String pw = "tiger";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Ex06() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공!!!");
			
			String sql = "select*from emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getEname(2);
				String job = rs.getNString(3);
				int mgr = rs.getInt(4);
				int sal = rs.getInt(6);
				int deptno = rs.getInt(8);
				
				System.out.printf("%d--%s--%s--%d--%d--%d--%d%n", args);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
	
	}	
	public static void main(String[] args) {
		new Ex06();
	}
	
	
	
	
}

	