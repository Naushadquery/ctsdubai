package com.nau.lambda;


interface Calculator2 {
	public void calc(int i);
	//public void calc1(int i);
}

class DoCalculation2 {
	public void doCalc(Calculator2 calculator, int number) {
		calculator.calc(number);
	}
}

public class LambdaDemos2 {

	public static void main(String[] args) {
		DoCalculation2 calculation = new DoCalculation2();
		Calculator2 calculator2 = new Calculator2() {
			@Override
			public void calc(int i) {
				System.out.println(" Total is " + (i + i));
			}

		
		};
		Calculator2 calculator3 = i -> {
			System.out.println("Lambda Total is " + (i + i));
		};
		calculation.doCalc(calculator3, 533);
	}

}
