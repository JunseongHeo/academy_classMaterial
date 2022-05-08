package ch12_polymorphism;

public class UpCastingChild extends UpCastingParent{
	private int z;
	
	public UpCastingChild() {
		x = 100;
		y = 200;
		z = 300;
	}

	@Override
	public int add() {
		System.out.println("childÀÇ add()");
		return x+y+z+s;
	}

	public int sub() {
		System.out.println("childÀÇ sub()");
		return x-y-z;
	}
	
	public int getz() {
		return z;
	}
	
	public void setz(int z) {
		this.z = z;
	}
}
