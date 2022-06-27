package ch11;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		
		String id = "java";
		String name = "���ؼ�";
		String tel = "010-123-4567";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
	
		String sql = "intsert int member values( {0}, {1}, {2} )";	
		Object[] arguments = { "'java'", "'���ؼ�'", "'010-245-7894'" }; 
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
