package alsong;

public class Test8_CarMain {

	public static void main(String[] args) {
		Test8_Car s1 = new Test8_Car();
		
		System.out.println("����ȸ�� : "+s1.company);
		System.out.println("�𵨸� : "+s1.model);
		System.out.println("���� : "+s1.color);
		System.out.println("�ְ�ӵ� : "+s1.maxspeed);
		System.out.println("����ӵ� : "+s1.speed);
		s1.speed = 60;
		System.out.println("�����ȼӵ� : "+s1.speed);

		
	}
}
