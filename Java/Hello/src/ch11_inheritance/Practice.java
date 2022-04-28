package ch11_inheritance;

public class Practice {
	
	public String name;
	public String[] pen;
	protected String pencil = "기본 HB 연필";
	private String eraser = "기본 플라스틱 지우개";

	public Practice() {
		System.out.println("파란 필통의 내용물은 다음과 같습니다.");
	}
	
	public void print() {
		for (int i = 0; i<pen.length; i++) {
			System.out.println("펜의 종류 : " + pen[i]);
		}
		System.out.println("연필 종류 : " +pencil);
		System.out.println("지우개 종류 : " +eraser);
	}
	public String[] getPen() {
		return pen;
	}
	
	public void setPen(String[] pen) {
		this.pen = pen;
	}

}
