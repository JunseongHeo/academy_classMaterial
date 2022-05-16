package ch8;

public class CarAdvancedForExample {

	public static void main(String[] args) {
		CarAdvancedFor myCar = new CarAdvancedFor();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
