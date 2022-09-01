package com.nau.lambda;


interface Calculator4 {
	public int calc(int i,int j);
	//public void calc1(int i);
}

class DoCalculation4 {
	public void doCalc(Calculator4 calculator, int number1 ,int number2) {
		int res = calculator.calc(number1,number2);
		System.out.println("Total is  : "  + res);
	}
}

public class LambdaDemos4 {

	public static void main(String[] args) {
		DoCalculation4 calculation = new DoCalculation4();
		Calculator4 calculator = new Calculator4() {
			@Override
			public int calc(int i,int j) {
				return i+j;
			}
		};
		//Calculator4 calculator1 = (i,j) -> {return i+j; };
		Calculator4 calculator1 = (i,j) ->  i+j ;
		calculation.doCalc(calculator1, 44,83);
	}

}
