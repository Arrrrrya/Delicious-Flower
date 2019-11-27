package com.syl.test_951_1000;

public abstract class _976_AbstratClassDemo {

	private String name;
	
	public _976_AbstratClassDemo(String name){
		System.out.println("I am Abstract");
		this.setName(name);
		System.out.println(name);
	}
	
	public abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
