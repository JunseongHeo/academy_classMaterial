package ch10;

import java.sql.*;

public class MemberMain {

	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user="hr";
	private static final String pwd="hr";
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
		
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			 
			stmt=conn.createStatement();
			System.out.println("Statement 객체 생성 성공");

			String query="insert into board VALUES('js','1234',920128,'분당','허준성','가능','유')";
			System.out.println(query);
			stmt.executeUpdate(query);
			
			String query2= "select * from board";
			System.out.println(query2);
			
			rs=stmt.executeQuery(query2);
			
			while(rs.next()) {
				System.out.print("아이디>>"+rs.getString("id"));
				System.out.print("패스워드>>"+rs.getString("password"));
				System.out.print("생년월일>>"+rs.getString("birth"));
				System.out.print("지역>>"+rs.getString("zone"));
				System.out.print("이름>>"+rs.getString("name"));
				System.out.print("보트소유여부>>"+rs.getString("boat"));
				System.out.print("보트사용시간>>"+rs.getString("boatTime"));
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Member m = new Member();
//		
//		m.setInfo("김병만", "666", "분당구"); 
//		// 멤버의 setter를 호출해서 private 멤버 변수에 값 할당
//	
//		String name = m.getName(); // m.name
//		String tel = m.getTel(); // m.tel
//		String address = m.getAddress(); // m.address
//		// 13~15번라인은 멤버의 getter를 호출해서 private 멤버변수의 값을 읽는다
//		
//		System.out.println("name : "+name);
//		System.out.println("tel : "+tel);
//		System.out.println("address : "+address);
	}
}
