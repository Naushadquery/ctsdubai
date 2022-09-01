package com.nau.lambda;

@FunctionalInterface
interface Calculator2 {
	public void calc();
}

class DoCalculation2 {
	public void doCalc(Calculator calculator) {
		calculator.calc();
	}
}

public class LambdaDemos2 {

	public static void main(String[] args) {
		DoCalculation2 calculation = new DoCalculation2();
	
	}

}
