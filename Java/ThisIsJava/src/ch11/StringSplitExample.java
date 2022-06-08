package ch11;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		
		// &, (,), - 3가지 기호를 제외하고 사람 이름만 뽑아내고 싶을때
		// |기호로 연결한 정규표현식을 매개값으로 제공하면 split()메서드가 구분자로 문자열 추출
		String[] names = text.split("&|,|-");
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]+"\n");
		
		System.out.println("향상된 for문");
		for(String name : names) {
			System.out.println(name);
		}
	
	}
}
