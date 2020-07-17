package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex09 {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	Connection conn;
	PreparedStatement pstmt;
	
	public Ex09() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속 성공");
			
			String sql="insert into dept(deptno, dname, loc) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 60);
			pstmt.setNString(2, "SALES");
			pstmt.setNString(3, "BUSAN");
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("record 입력 성공");
			}
			else {
				System.out.println("record 입력 실패");
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				System.out.println("DB 연결 종료");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new Ex09();
	}
}
