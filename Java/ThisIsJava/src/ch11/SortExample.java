package ch11;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
//		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = { "�垮瘚�", "夢翕熱", "梯團熱" };
//		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		MemberSortExample m1 = new MemberSortExample("�垮瘚�");
		MemberSortExample m2 = new MemberSortExample("夢翕熱");
		MemberSortExample m3 = new MemberSortExample("梯團熱");
		MemberSortExample[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"].name="+members[i].name);
		}
	}
}
