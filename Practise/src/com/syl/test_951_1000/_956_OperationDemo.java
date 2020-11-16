package com.syl.test_951_1000;

abstract class Operation {
	public double number_a;
	public double number_b;
	public abstract double getResult();
}

class PlusOperation extends Operation{
	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return number_a + number_b;
	}
}

class SubOperation extends Operation{
	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return number_a - number_b;
	}
}

public class _956_OperationDemo{
	public static void main(String[] args) {
		Operation demo = new PlusOperation();
		demo.number_a = 1;
		demo.number_b = 2;
		System.out.println(demo.getResult());
		
		demo = new SubOperation();
		demo.number_a = 1;
		demo.number_b = 2;
		System.out.println(demo.getResult());
	}
}
