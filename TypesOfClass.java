package com.nau.interfacedemos;

interface Calc {
	int doCalc(int i, int j);
}

class Calculator {
	public int calculate(Calc calc, int i, int j) {
		int res = calc.doCalc(i, j);
		return res;
	}
}
class AddCalc implements Calc{
	@Override
	public int doCalc(int i, int j) {
		return i+j;
	}
}
class SubCalc implements Calc{
	@Override
	public int doCalc(int i, int j) {
		return i-j;
	}
}
public class TypesOfClass {
	private static  class InnerSubCalc implements Calc{ // inner class
		@Override
		public int doCalc(int i, int j) {
			return i-j + 10;
		}
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	//	Calc calc = new SubCalc();
	//	int r = calculator.calculate(calc, 59, 5);
	//	Calc calc = new InnerSubCalc();
		
		class LocalSubCalc implements Calc{
			@Override
			public int doCalc(int i, int j) {
				return i-j + 10;
			}
		}
		class LocalAddCalc implements Calc{ // Local Class
			@Override
			public int doCalc(int i, int j) {
				return i+j + 10;
			}
		}
		//Calc calc = new LocalSubCalc();
		
		Calc calc = new Calc() { // Anonymous Class
			@Override
			public int doCalc(int i, int j) {
				return i+j;
			}
		};
		
		int r = calculator.calculate(calc, 44, 54);
		System.out.println(r); 
	}
}
class XYZ {
	//int ic = new TypesOfClass.InnerSubCalc().doCalc(1, 2);
}
