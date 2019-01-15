package com.syl.test;

public class _013_AbstractDemo {
	public static void main(String[] args) {
		Vehicle Tru = new Truck();
		Tru.function();
		Vehicle Car = new Car();
		Car.function();
	}
}

abstract class Vehicle {
	public abstract void function();
}

class Truck extends Vehicle {
	public void function() {
		System.out.println("Truck run");
	}
}

class Car extends Vehicle {
	public void function() {
		System.out.println("Car run");
	}
}
