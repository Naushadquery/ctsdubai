package com.nau.lambda;

@FunctionalInterface
interface Calculator {
	public void calc();
}

class DoCalculation {
	public void doCalc(Calculator calculator) {
		calculator.calc();
	}
}

public class LambdaDemos {

	public static void main(String[] args) {
		DoCalculation calculation = new DoCalculation();
		Calculator calculator = new Calculator() {
			@Override
			public void calc() {
				System.out.println("calculating something");
			}
		};
		calculation.doCalc(calculator);
		
		Calculator calculator2 = () -> {
			System.out.println("Welcome to Lambda ");
			System.out.println("Welcome to Functional Programming");
		};

		calculation.doCalc(calculator2);
		
		calculation.doCalc(() -> {
			System.out.println("Welcome to Lambda2  ");
			System.out.println("Welcome to Functional Programming 2");
		});
	}

}
