package Info;

public class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("���ؼ�", "010-9370-2416", "1992/01/28");
		PhoneInfo pInfo2 = new PhoneInfo("������", "010-3232-3232");
		
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}
