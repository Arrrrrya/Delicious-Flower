package com.syl.designMode.s5_proxy;

public class Proxy extends Subject {
	private RealSubject subject = null;

	public Proxy() {
		// TODO Auto-generated constructor stub
		subject = new RealSubject();
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.before();
		subject.request();
		this.after();
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}

}
