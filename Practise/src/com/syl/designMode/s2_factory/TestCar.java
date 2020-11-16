package com.syl.designMode.s2_factory;

public class TestCar {
	public static void main(String[] args) {
		Car car1 = new SmallCar();
		Car car2 = new BigCar();
		car1.showType();
		car2.showType();
		car1.showSpeed();
		car2.showSpeed();
	}
}
