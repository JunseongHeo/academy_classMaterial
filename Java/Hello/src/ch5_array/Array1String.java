package ch5_array;

public class Array1String {

	public static void main(String[] args) {
		String[] arrString = {"January", "February", "March", "Aprill", "May", "June",
				"July", "August", "September", "October", "November", "December"};

		int i;
		System.out.println("�����");
		for (i=0; i<arrString.length; i++) {
			System.out.println(arrString[i]);
		}
		
		for (i=0; i<arrString.length; i++) {
			arrString[i] = (i+1) + "��";
		}
		
		System.out.println("�ѱ۷�");
		for (i=0; i<arrString.length; i++) {
			System.out.println(arrString[i]);
		}
		
	}

}
