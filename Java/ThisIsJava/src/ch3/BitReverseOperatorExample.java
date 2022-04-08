package ch3;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1) + " (������ : " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (������ : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (������ : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + " (������ : " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (������ : " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (������ : " + v6 + ")");
	}

	public static String toBinaryString(int Value) {
		String str = Integer.toBinaryString(Value);
		while (str.length() <32) {
			str = "0" + str;
		}
		
		return str;
	}
	
}