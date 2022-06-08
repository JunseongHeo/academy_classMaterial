package ch11;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		
		// &, (,), - 3���� ��ȣ�� �����ϰ� ��� �̸��� �̾Ƴ��� ������
		// |��ȣ�� ������ ����ǥ������ �Ű������� �����ϸ� split()�޼��尡 �����ڷ� ���ڿ� ����
		String[] names = text.split("&|,|-");
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]+"\n");
		
		System.out.println("���� for��");
		for(String name : names) {
			System.out.println(name);
		}
	
	}
}
