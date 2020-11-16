package com.syl.designMode.s5_proxy;

public abstract class Subject {
	public abstract void request();
}

class RealSubject extends Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
