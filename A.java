package com.nau.a;

import com.nau.b.B;

final  class Z {
	public  void zm() {}

	public void zm1() {
	}
}

class D{
	private D(){}
	public static void da() {
		
	}
}
class DD{
	//D d = new D();
}
abstract class X {
	public abstract void xa();
}

abstract class XX extends X{
	
}
// abstract ,  final

class Y {
	Z z = new Z();
//	X x = new X();
}

public class A extends B {

	protected int x = 50; //

	public A() { // default
		System.out.println("A object created");
	}

	public A(int i) {
		super();
		// super(i);
		System.out.println("A object created with i = " + i);
	}

	@Override
	public void methodB() {
		System.out.println("methodB in class A");
	}

	public static final int XY = 50;

	final public void methodA() {

		System.out.println("methodA in class A");
	}

	public void methodAA() {
		System.out.println("methodAA in class A");
	}

	@Override
	public String toString() {
		return "This is A class";
	}

}
