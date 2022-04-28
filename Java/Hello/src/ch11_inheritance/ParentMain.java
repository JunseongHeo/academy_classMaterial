package ch11_inheritance;

public class ParentMain {

	public static void main(String[] args) {
		Parent p = new Parent(); // 객체가 생성되면 바로 생성자가 호출되어 메세지를 출력
		p.name = "부모"; 
		p.age = 50;
		p.setMoney(1000000);
		p.printParentInfo();
		System.out.println("money : "+p.getMoney());
		System.out.println("---------------");
		
		Child c = new Child(); // Child 객체가 생성되면서 Parent생성자, Child생성자 호출. 부모로부터 파생
		c.name = "자식"; 
		c.age = 200; 
		c.setHobby("기타");
		c.printParentInfo();
		c.printInfo();
	}
}
