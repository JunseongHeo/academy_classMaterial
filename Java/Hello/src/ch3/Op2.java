package ch3;

public class Op2 {

	public static void main(String[] args) {
		// ���� ������ �ǽ�
		
		int i = 5, j;
		j = i++;
		System.out.println("j="+j); // 5
		j = ++i;
		System.out.println("j="+j); // 7
		j = i--;
		System.out.println("j="+j); // 7
		j = --i;
		System.out.println("j="+j); // 5
		
		System.out.println("���� i="+i); // 5
		System.out.println("i++ :"+i++); // 5
		System.out.println("++i :"+(++i)); // 7
		System.out.println("i-- :"+i--); // 7
		System.out.println("--i :"+(--i)); // 5
		
		int df = 13;
		int ef = 12;
		System.out.println((df+ef)/2);
		
	}

}
