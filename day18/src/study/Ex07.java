package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex07 {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	String driver ="oracle.jdbc.driver.OracleDriver";
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Ex07() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
			
			String sql = "select deptno, dname, loc from dept order by deptno";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("부서번호\t부서이름\t지역");
			System.out.println("==============================================");
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getNString(2);
				String 	loc = rs.getNString(3);
				System.out.printf("%7d %15s %15s%n", deptno, dname, loc);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
				System.out.println("DB 연결 해제");
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
