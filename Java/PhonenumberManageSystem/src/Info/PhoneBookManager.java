package Info;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	public void inputData() {
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		System.out.print("������� : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phoneNumber, birth);
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public void searchData() {
		System.out.println("������ �˻��� �����մϴ�..");
		System.out.println("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx<0) {
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
		}
	}
	public void deleteData() {
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.println("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx<0) {
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		} else {
			for (int idx = dataIdx; idx<(curCnt-1); idx++) {
				infoStorage[idx] = infoStorage[idx+1];
			}
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		}
		
		
	}
	private int search(String name) {
		for(int idx = 0; idx<curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name) == 0) {
				return idx;
			}
		}
		return -1;
	}
}
