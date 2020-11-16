package com.syl.designMode.s4_facade;

public class Facade {
	SubSystemA a;
	SubSystemB b;

	public Facade() {
		a = new SubSystemA();
		b = new SubSystemB();
	}

	public void showA() {
		this.a.doThingsA();
	}

	public void showB() {
		this.b.doThingsB();
	}
}

class SubSystemA {
	public void doThingsA() {
		System.out.println("子系统A");
	}
}

class SubSystemB {
	public void doThingsB() {
		System.out.println("子系统B");
	}
}
