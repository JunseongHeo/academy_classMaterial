package ch11;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
	
		System.out.println(str1.equals(str2)); // ó�� �Է��� ���ڿ� ��
		
		String lowerStr1 = str1.toLowerCase(); // ���ڿ� �ҹ��ڷ� �ٲ�
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2)); // �ҹ��ڷ� �ٲ� ���ڿ� ��
	 	
		System.out.println(str1.equalsIgnoreCase(str2)); // ��ҹ��� �����ϰ� ��
	}
}
