package alsong;

public class Test8_HumanMain {

	public static void main(String[] args) {
		Test8_Human h1 = new Test8_Human();
		Test8_Human h2 = new Test8_Human();
		Test8_Human h3 = new Test8_Human();

		h1.name = "허준성";
		h1.height = 170;
		h1.weight = 70;
		
		h2.name = "이준성";
		h2.height = 180;
		h2.weight = 80;
		
		h3.name = "삼준성";
		h3.height = 190;
		h3.weight = 90;
		
		h1.print();
		h2.print();
		h3.print();
			
	}
}
