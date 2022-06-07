package ch11;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
	
		System.out.println(str1.equals(str2)); // 처음 입력한 문자열 비교
		
		String lowerStr1 = str1.toLowerCase(); // 문자열 소문자로 바꿈
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2)); // 소문자로 바꾼 문자열 비교
	 	
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 비교
	}
}
