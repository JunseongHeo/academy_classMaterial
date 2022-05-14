package ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class algorithmTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("abr");
		list.add("tu");
		
		System.out.println("����");
		Collections.sort(list);
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n�˻�");
		int idx = -1;
		idx = Collections.binarySearch(list, "abr");
		
		if( idx < 0) {
			System.out.println("����.");
		} else {
			System.out.println(idx + "��ġ�� ����Ÿ " + list.get(idx) + "�� �ִ�.");
		}
		
		System.out.println("\n����(shuffle)");
		Iterator<String> i2 = list.iterator();
		Collections.shuffle(list);
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
