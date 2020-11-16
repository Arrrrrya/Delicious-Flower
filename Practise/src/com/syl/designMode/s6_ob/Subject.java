package com.syl.designMode.s6_ob;

import java.util.Vector;

/**
 *  定义一个观察者数组，并实现增、删及通知操作。它的职责很简单，就是定义谁能观察，谁不能观察，用Vector是线程同步的，比较安全，也可以使用ArrayList，是线程异步的，但不安全。
 * @from 
 * @author Arya
 * @email sun_mir@qq.com
 */
public class Subject {
	private Vector<Observer> oVector = new Vector<Observer>();
	
	public void addObserver(Observer observer) {
		this.oVector.add(observer);
	}
	
	public void delObserver(Observer observer) {
		this.oVector.remove(observer);
	}
	
	public void notifyObserver(String str) {
		for (Observer observer : this.oVector) {
			observer.update(str);
		}
	}
}
