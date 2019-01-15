package com.syl.test;

/**
 * 
 * @question 
 * @link  
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _012_clazzDemo {
	public static void main(String[] args) {
		new People("张三").run();
		new Student("李四").study();
		new Teacher("王五").teach();
	}
}

class People {
	private String name;

	public People(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is a people");
	}
}

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println(name + " is a student");
	}
}

class Teacher {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	public void teach() {
		System.out.println(name + " is a teacher");
	}
}
