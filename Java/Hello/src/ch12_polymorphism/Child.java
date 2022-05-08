package ch12_polymorphism;

public class Child extends Parent{
	private String hobby;
	
	@Override // 재정의 어노테이션(컴파일러 주석)을 컴파일러에 상속받은 메서드를 재정의함을 알려줌
	
	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("hobby : "+hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
