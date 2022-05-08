package ch12_polymorphism;

public class ParentMain {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		System.out.println("------------");
		Child c = new Child();
		c.name = "parent";
		c.setHobby("swimming");
		c.printInfo();
	}
}
