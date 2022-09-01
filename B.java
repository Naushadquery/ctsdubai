package com.nau.b;

import com.nau.c.C;

public class B extends C {

	public B() {
		System.out.println("B object created");
	}

	public B(int i) {
		System.out.println("B object created with i = " + i);
	}

	public void methodB() {
		System.out.println("methodB in class B");
	}

	public void methodBB() {
		System.out.println("methodBB in class B");
	}
//	@Override 
//	public String toString() {
//		return "BBBB";
//	}
}
