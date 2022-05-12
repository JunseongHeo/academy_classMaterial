package ch15;

public class ThrowExc {
	String str = null; // 이 클래스는 String 멤버변수 str를 갖는다.
	
	// 메서드 subStr()은 멤버변수 str을 파라메터 idx  위치부터 잘라낸다.
	// 그래서 문자열 처리 전 str이 null인지를 확인하고 null이면 예외를 발생하고
	// null이 아니면
	
	public String subStr(int idx) {
		if ( str == null ) {
			System.out.println("str이 null이다.");
			throw new NullPointerException();
		} else {
			return str.substring(idx);
		}
	}
	
}
