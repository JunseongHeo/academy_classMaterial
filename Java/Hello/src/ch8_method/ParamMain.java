package ch8_method;

public class ParamMain {

	public static void main(String[] args) {
		
		Add a = new Add(); //  Ŭ����Add�� ��ü a�� ���� 
		
		int result_int;
		float result_float, x=3.2f, y=8.5f;
		String result_string;
		
		result_int = a.add_int(3, 5); 
		// ���� result_int�� ��ü a(Ŭ���� Add�� ��ü����)�� add_int�޼��� �����ؼ� ��ȯ�� ����. �Ķ���ʹ� 3, 5
		System.out.println("result of int = " + result_int);
		result_float = a.add_float(x, y);
		System.out.println("result of float = " + result_float);
		result_string = a.add_stirng("aaa", "bbb");
		System.out.println("result of String = " + result_string);
		
	}

}