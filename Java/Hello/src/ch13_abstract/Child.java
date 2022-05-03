package ch13_abstract;

public class Child extends Parent {
	public String hobby;
	
	@Override
	public void print() {
		System.out.println("child");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	@Override
	public void test() {
		System.out.println("hobby = "+hobby);
	}
	public void parentPrint() {
		super.print();
	}
}
