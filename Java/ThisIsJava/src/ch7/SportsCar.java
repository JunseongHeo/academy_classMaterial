package ch7;

public class SportsCar extends Car{
		@Override
		public void speedUp() { speed += 10; }
		
// final �޼��� �������̵��� �� ���� 
//		@Override
//		public void stop() {
//			System.out.println("������ī�� ����");
//			speed = 0;
//		}
}
