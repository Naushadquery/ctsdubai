package com.nau.day8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class B {
	public void bmethod() {
		System.out.println("bmethod");
	}
}

class A extends B {

	private int x;

	public A() {
	}

	public void am(String message) {
		System.out.println("a method called " + message);
	}

	private void amethoda() {
		System.out.println("amethoda private ");
	}
}

public class ReflectionDemo extends Object {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		A a = new A();
		displayObjectInfo(a);
	}

	private static void displayObjectInfo(Object obj) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String cname = obj.getClass().getName();
		Class<?> c = obj.getClass();
		String s = c.getName();
		System.out.println(s);
		System.out.println("========== Methods ======= ");
		Method m[] = c.getMethods();
		for (Method mm : m) {
			System.out.print(mm.getName() + " : ");
			if (mm.getName().equals("am")) {
				mm.invoke(obj, "hello boss");
			}
			int pcount = mm.getParameterCount();
			System.out.println(mm.getReturnType());
		}
		System.out.println("=============================");
		Method dm[] = c.getDeclaredMethods();
		for (Method dmm : dm) {
			System.out.print(dmm.getName() + " : ");
			int dcount = dmm.getParameterCount();
			System.out.println(dmm.getReturnType());
		}

		Method mv = c.getDeclaredMethod("amethoda");
		mv.setAccessible(true);
		mv.invoke(obj);

	}

}
