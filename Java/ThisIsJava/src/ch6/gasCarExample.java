package ch6;

public class gasCarExample {

	public static void main(String[] args) {
		gasCar myCar = new gasCar();
		
		myCar.setGas(5); // gasCar�� setGasȣ��
		
		boolean gasState = myCar.isLeftGas(); // Car�� isLeftGas() �޼ҵ� ȣ��
		
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); // gasCar�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) { // Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���");
		}
		
	}

}
