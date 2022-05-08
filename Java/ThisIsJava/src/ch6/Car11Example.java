package ch6;

public class Car11Example {

	public static void main(String[] args) {
		Car11 myCar = new Car11();
		
		// 잘못된 속도변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : "+myCar.getSpeed());
	}
}
