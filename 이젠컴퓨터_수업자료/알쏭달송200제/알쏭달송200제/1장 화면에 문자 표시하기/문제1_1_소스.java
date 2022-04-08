문제 1-1
콘솔 화면에 "첫 Java 프로 그램입니다." 와 "화면에 출력하고 있습니다."를
한 줄씩 출력하는 프로그램을 작성하자.

//화면에 출력을 지시하는 프로그램
class Hello {
	public static void main(String[] args) {
		System.out.println("첫 Java 프로그램입니다.");
		System.out.println("화면에 출력하고 있습니다.");
		// 주의! println에 사용한 l은 영문 소문자 l입니다.
	}
}

문제 1-5
한줄에 한 글자씩 자신의 이름을 표시하는 프로그램을 작성하자.
단, 성과 이름 사이에 빈 줄을 추가한다.

//자신의 이름을 한 줄에 한 글자씩 표시(방법1)
public class PrintName2A {
	public static void main(String[] args) {
		System.out.println("홍");
		System.out.println();
		System.out.println("길");
		System.out.println("동");
	}
}
//자신의 이름을 한 줄에 한 글자씩 표시(방법2)
public class PrintName2B {
	public static void main(String[] args) {
		System.out.println("홍\n\n길\n동");
		}
}