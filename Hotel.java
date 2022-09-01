package com.nau.interfacedemos;

public class Hotel {
	
	public static void main(String[] args) {
		
		CoffeeHouse coffeeHouse = new CoffeeHouse();
		
		Coffee coffee = new Coffee() {
			@Override
			public void typeOfCoffee(String coffeeName) {
				System.out.println("Your coffe " + coffeeName + " is ready");
			}
		};
		// lamba expression
		
		coffeeHouse.orderCoffee(coffee, "capachino");
		coffeeHouse.orderCoffee(coffee, "lathe");
		coffeeHouse.orderCoffee(new Coffee() {
			@Override
			public void typeOfCoffee(String coffeeName) {
				System.out.println("Your coffee with extra milk " + coffeeName + " is ready");
			} 
		}, "espresso");
	}
}
