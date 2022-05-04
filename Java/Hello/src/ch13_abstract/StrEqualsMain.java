package ch13_abstract;

import java.util.Scanner;

public class StrEqualsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String id = "gjwnstjd"; // id와 pwd를 정한다.
		String pwd = "123456";
		
		System.out.print("id : "); // 사용자로부터 아이디와 패스워드를 입력받는다.
		String id_str = scanner.next();
		
		System.out.print("pwd : ");
		String pwd_str = scanner.next();
		
		// String 클래스의 equals는 문자열이 동일한지를 비교하여 대소문자를 구분
		if ( id.equals(id_str) && pwd.equals(pwd_str)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		scanner.close();
	}
}
