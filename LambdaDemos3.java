package com.nau.lambda;


interface Calculator3 {
	public void calc(int i,int j);
	//public void calc1(int i);
}

class DoCalculation3 {
	public void doCalc(Calculator3 calculator, int number1 ,int number2) {
		calculator.calc(number1,number2);
	}
}

public class LambdaDemos3 {

	public static void main(String[] args) {
		DoCalculation3 calculation = new DoCalculation3();
		Calculator3 calculator = new Calculator3() {
			@Override
			public void calc(int i,int j) {
				System.out.println(" Total is " + (i + j));
			}
		};
		Calculator3 calculator1 = (i,j) -> {
			System.out.println("Lambda Total is " + (i + j));
		};
		calculation.doCalc(calculator1, 4,8);
	}

}
