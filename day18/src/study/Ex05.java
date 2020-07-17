package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// JDBC : Java DataBase Connectivity

public class Ex05 {
	//uniformed resources location
//	SID = DB가 저장되는 한 공간 => jdbc:oracle:thin:@localhost:1521:xe
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "tiger";
	
//	Connection 객체 : DB와 연결을 돕는 객체
	Connection conn = null;
//	PreparedStatement : Query문(SQL)을 보관하고, DBMS(DB 관리 소프트웨어)에 전달하는 객체
	PreparedStatement  pstmt = null;
//	ResultSet : Query문(SQL)의 결과를 받아오는 객체
//	<- select 문에서 사용함
//	Select로 보여지는 데이터를 저장할 공간. select만 resultset을 사용함
	ResultSet rs = null;
	
	//생성자
	public Ex05() {

//	day18 - new - build path - configure build path - library 탭 클릭 -   add external jars- C:\Program Files\Java\jre1.8.0_251\lib\ext- ojdbc6(?) 클릭 &apply
	
		// 1) 드라이버 등록 -oracle.driver 패키지에서 - OracleDriver.class 찾고 - oracle.jdbc.driver.OracleDriver
		try {
//			alt shift z 로 예외 처리
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2) Connection 열기 (접속하기)
		//    Connection 객체 생성하기
		//	  url, id, password
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("연결 성공!!!");
		
		String sql = "select*from emp" + "where deptno = ?"; //wildcard ?
				
		
		pstmt = conn.prepareStatement("sql");
		pstmt.setInt(1,  30); // 첫번째 ?에 30을 세팅한다.
		// 그걸 보관하는 곳이 resultset  
		// 응답을 받고 실행한걸 rs에 저장
		rs = pstmt.executeQuery();
		/* pstmt.executeQuery();
		 * 	1) Query(SQL)문을 DBMS에 전달
		 *  2) DBMS는 전달받은 SQL문을 실행해서
		 *     그 결과(data)를
		 *  3) Java Application 으로 돌려줌
		 *  4) Java Application이 DBMS가 보내 준 
		 *     data를 받아서
		 *  5) Heap Memory 에 생성된
		 *     ResultSet 객체에 생성함
		 */
		
		/* rs.next;
		 * 레코드 하나를 꺼냄	
		 int empno = rs.getInt(1)
			해당 레코드의 첫 번째 컬럼에 있는 data를 꺼내서
			int empno에 저장함
		*/
		
		
		
		/*
EMPNO    NOT NULL 1NUMBER(4)    
ENAME             2VARCHAR2(10) 
JOB               3VARCHAR2(9)  
MGR               4NUMBER(4)    
HIREDATE          5DATE         
SAL               6NUMBER(7,2)  
COMM              7NUMBER(7,2)  
DEPTNO            8NUMBER(2)    
 */
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			int sal = rs.getInt(6);
			int deptno = rs.getInt(8);
			System.out.println(
			empno+"--"+ename+"--"+job+"--"+mgr+"--"+sal+"--"+deptno);
			
		}
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
			if(rs!=null) {rs.close();}
			if(pstmt !=null) {pstmt.close();}
			if(conn != null) {
				System.out.println("연결해제...");
				conn.close();
			}
			}
			 catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		new Ex05();
	}	
 }
