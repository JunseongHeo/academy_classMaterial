package ch4;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if (keyCode!=13 && keyCode!=10) { // Enter�Է½� 13,10�� �ԷµǹǷ� �ش簪�� ����
				System.out.println("-----------------");
				System.out.println("1.����|2.����|3.����");
				System.out.println("-----------------");
				System.out.print("���� : ");
			}
			keyCode = System.in.read(); // Ű������ Ű�ڵ带 ���� 
			
			if(keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� = " +speed);
				
			} else if(keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ� = " +speed);
			} else if(keyCode == 51) {
				run = false;
			} 
		}
		System.out.println("���α׷� ����");
	}
}