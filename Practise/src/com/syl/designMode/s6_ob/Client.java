package com.syl.designMode.s6_ob;

/**
 * 测试类
 * @from 
 * @author Arya
 * @email sun_mir@qq.com
 */
public class Client {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		subject.addObserver(new RealObserver());
		subject.addObserver(new RealObserver());
		subject.addObserver(new RealObserver());
		subject.addObserver(new RealObserver());
		subject.addObserver(new RealObserver());
		subject.doSomething("当前价格为100");
	}
}
