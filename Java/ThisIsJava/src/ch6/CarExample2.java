package ch6;

public class CarExample2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ� : "+speed+"km/h");
	}
}
