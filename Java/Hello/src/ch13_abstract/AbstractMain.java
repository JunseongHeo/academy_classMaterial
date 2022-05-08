package ch13_abstract;

public class AbstractMain {

	public static void main(String[] args) {
		GrandParent gp = new Child();
		gp.name = "grand papa";
		gp.age = 90;
		gp.print();
		gp.test();
		System.out.println("--------------");
		Child c = new Child();
		c.name = "child momo";
		c.age = 10;
		c.hobby = "study";
		c.print();
		c.test();
		c.parentPrint();
	}
}
