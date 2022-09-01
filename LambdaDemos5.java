package com.nau.lambda;


interface Calculator5 {
	public int calc(int i,int j);
	//public void calc1(int i);
}

class DoCalculation5 {
	public int doCalc(Calculator5 calculator, int number1 ,int number2) {
		int res = calculator.calc(number1,number2);
		return res;
	}
}

public class LambdaDemos5 {

	public static void main(String[] args) {
		DoCalculation5 calculation = new DoCalculation5();
		Calculator5 calculator = new Calculator5() {
			@Override
			public int calc(int i,int j) {
				return i+j;
			}
		};
		//Calculator5 calculator1 = (i,j) -> {return i+j; };
		Calculator5 calculator1 = (i,j) ->  i+j ;
		int res = calculation.doCalc(calculator1, 55,83);
		System.out.println("RESULT IS " + res);
	}
}
