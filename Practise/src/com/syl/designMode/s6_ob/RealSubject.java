package com.syl.designMode.s6_ob;

/**
 * 在这里实现具体业务，在具体项目中，该类会有很多变种。
 * @from 
 * @author Arya
 * @email sun_mir@qq.com
 */
public class RealSubject extends Subject {
	public void doSomething(String str) {
		super.notifyObserver(str);
	}
}
