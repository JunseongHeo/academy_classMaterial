package ch7_class;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s = new Shape(); // Shape클래스 객체 s를 생성
		s.p.x = 10;
		s.p.y = 20;
		s.draw();
	}
}
