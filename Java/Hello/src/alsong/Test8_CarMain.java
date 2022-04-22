package alsong;

public class Test8_CarMain {

	public static void main(String[] args) {
		Test8_Car s1 = new Test8_Car();
		
		System.out.println("제작회사 : "+s1.company);
		System.out.println("모델명 : "+s1.model);
		System.out.println("색깔 : "+s1.color);
		System.out.println("최고속도 : "+s1.maxspeed);
		System.out.println("현재속도 : "+s1.speed);
		s1.speed = 60;
		System.out.println("수정된속도 : "+s1.speed);

		
	}
}
