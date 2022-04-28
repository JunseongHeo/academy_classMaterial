package ch11_inheritance;

public class Child extends Parent {
	private String hobby; // 취미변수 추가. Parent클래스에서 name, age도 사용
	
	public Child() { // 생성자
		System.out.println("Child 생성자");
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
//		System.out.println("money : " + money); 에러발생
		System.out.println("hobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby ( String hobby ) {
		this.hobby = hobby;
	}
}
