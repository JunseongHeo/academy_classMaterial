package ch6;

public class Car11Example {

	public static void main(String[] args) {
		Car11 myCar = new Car11();
		
		// �߸��� �ӵ�����
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
	}
}
