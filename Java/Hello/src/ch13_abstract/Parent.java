package ch13_abstract;

public abstract class Parent extends GrandParent {
	
	@Override
	public void print() {
		System.out.println("parent");
		System.out.println("name = "+name);
	}
	// GP의 print 메서드만 구현하고 test는 구현하지 않아 
	// P도 추상클래스이며, 객체를 가질 수 없다.
}
