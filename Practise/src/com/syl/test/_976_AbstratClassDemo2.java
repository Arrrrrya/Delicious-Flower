package com.syl.test;

public class _976_AbstratClassDemo2 extends _976_AbstratClassDemo {

	public _976_AbstratClassDemo2(String name) {
		super(name);
		System.out.println("my parant is Abstract");
	}

	public void run() {
		System.out.println("my run, not my parent's");

	}

	public static void main(String[] args) {
		_976_AbstratClassDemo A = new _976_AbstratClassDemo2("syl");
		A.run();
		
		_976_AbstratClassDemo2 B = new _976_AbstratClassDemo2("xxx");
		B.run();
	}

}
