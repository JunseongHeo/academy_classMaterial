package ch8;

public class Example {

	public static void main(String[] args) {
		ImplemetationC impl = new ImplemetationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); // InterfaceA������ methodA()�� ȣ�Ⱑ��
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); // InterfaceB������ methodB()�� ȣ�Ⱑ��
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		System.out.println(); // InterfaceC������ ��� ȣ�Ⱑ��
	}

}
