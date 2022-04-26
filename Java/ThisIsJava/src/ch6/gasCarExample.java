package ch6;

public class gasCarExample {

	public static void main(String[] args) {
		gasCar myCar = new gasCar();
		
		myCar.setGas(5); // gasCar의 setGas호출
		
		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // gasCar의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요");
		}
		
	}

}
