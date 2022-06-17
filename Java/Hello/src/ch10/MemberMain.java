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
			System.out.println("Oracle ����̹� �ε� ����");
		
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");
			 
			stmt=conn.createStatement();
			System.out.println("Statement ��ü ���� ����");

			String query="insert into board VALUES('js','1234',920128,'�д�','���ؼ�','����','��')";
			System.out.println(query);
			stmt.executeUpdate(query);
			
			String query2= "select * from board";
			System.out.println(query2);
			
			rs=stmt.executeQuery(query2);
			
			while(rs.next()) {
				System.out.print("���̵�>>"+rs.getString("id"));
				System.out.print("�н�����>>"+rs.getString("password"));
				System.out.print("�������>>"+rs.getString("birth"));
				System.out.print("����>>"+rs.getString("zone"));
				System.out.print("�̸�>>"+rs.getString("name"));
				System.out.print("��Ʈ��������>>"+rs.getString("boat"));
				System.out.print("��Ʈ���ð�>>"+rs.getString("boatTime"));
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
//		m.setInfo("�躴��", "666", "�д籸"); 
//		// ����� setter�� ȣ���ؼ� private ��� ������ �� �Ҵ�
//	
//		String name = m.getName(); // m.name
//		String tel = m.getTel(); // m.tel
//		String address = m.getAddress(); // m.address
//		// 13~15�������� ����� getter�� ȣ���ؼ� private ��������� ���� �д´�
//		
//		System.out.println("name : "+name);
//		System.out.println("tel : "+tel);
//		System.out.println("address : "+address);
	}
}
