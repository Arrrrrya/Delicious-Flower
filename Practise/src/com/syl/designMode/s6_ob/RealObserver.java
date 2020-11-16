package com.syl.designMode.s6_ob;

public class RealObserver implements Observer {

	@Override
	public void update(String str) {
		System.out.println(str);
	}
	
}
