package ch7_class;

public class Product {
	
	int num; // 제품 번호
	String name; // 제품명

	void print() {
		System.out.println("------------------");
		System.out.println("객체 "+name+"의 정보 출력");
		System.out.println("num = " + num);
		System.out.println("name = " + name);
		System.out.println("------------------");
	}
	
}
