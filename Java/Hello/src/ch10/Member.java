package ch10;

public class Member {
	private String name; // 멤버는 모두 private, 
	private String tel;  // 보통 클래스의 멤버변수는 private로 지정해 
	private String address; // 외부 정보가 직접 공개되는 것을 막는다.
	
	public void printMember() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
	
	public String getName() { // 멤버변수 name의 getter로 클래스 밖에서 name값을 읽을 때 호출. 
		return name;
	}
	
	public void setName(String name) { // 멤버변수 name의 setter로 클래스 밖에서 넣어준 파라메터 값을 name에 할당
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
