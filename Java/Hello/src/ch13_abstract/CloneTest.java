package ch13_abstract;

public class CloneTest implements Cloneable { // �������̽�(���) 
	public int x;
	public int y;
	
	@Override // clone ������
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
