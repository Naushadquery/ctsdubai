package com.nau.interfacedemos;

@FunctionalInterface
public interface Coffee {
	
	int x =50;
	
	public void typeOfCoffee(String coffeeName);
	//public void typeOfCoffee1(String coffeeName);
	
	default public void defaultCoffee() {
		System.out.println("Normal Coffee");
	}
	default public void defaultCoffee1() {
		System.out.println("Normal Coffee");
	}
	static public void defaultCoffee3() {
		System.out.println("Normal Coffee");
	}
	private void defaultCoffee4() { 
		System.out.println("Normal Coffee");
	}
}
class CH {
	
	public CH() {
		Coffee.defaultCoffee3();
	}
	
}
 