package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex08 {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	Connection conn;
	Statement stmt;
	
	public Ex08() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속 성공 !!!");
			
			String sql = "insert into dept values (55, 'Sales', 'seoul')";
			stmt = conn.createStatement();
			
			if(!stmt.execute(sql)) {
				System.out.println("insert 성공");
			}
						
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String args[]) {
		new Ex08();
	}

}
