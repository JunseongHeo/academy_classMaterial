package ch8;

public class Example {

	public static void main(String[] args) {
		ImplemetationC impl = new ImplemetationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); // InterfaceA변수는 methodA()만 호출가능
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); // InterfaceB변수는 methodB()만 호출가능
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		System.out.println(); // InterfaceC변수는 모두 호출가능
	}

}
