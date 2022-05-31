package ch11;

public class StringCharAtExample {

	public static void main(String[] args) {
		String snn = "920128-1230123";
		char sex = snn.charAt(7); // 8번째 인덱스의 문자 추출
		
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
