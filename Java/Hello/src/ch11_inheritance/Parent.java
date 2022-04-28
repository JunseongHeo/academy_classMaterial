package ch11_inheritance;

public class Parent {

	public String name;
	protected int age; // 상속관계의 클래스에서만 접근가능
	private int money; // 상속 제외
	
	public Parent() { // 생성자, 자식클래스에 상속되지 않는다
		System.out.println("Parent 생성자");
	}
	
	public void printParentInfo() { // name, age멤버변수를 출력하는 메서드
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	public int getMoney() { // private 멤버 money의 getter.
		return money;
	}
	
	public void setMoney(int money) { // private 멤버money의 setter
		this.money = money;
	}
	// this. 클래스의 메서드나 생성자에서 현재 객체를 나타내는 참조변수
	
}
