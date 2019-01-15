package com.syl.test;

/**
 * 
 * @question
 * @link
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _012_ClazzDemo {
	public static void main(String[] args) {
		new People("aaron").run();

		new People("arya").new Student("buck").study();

		new People("arya").new Student("buck").run();
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

	public void study() {
		new Student("").study();
	}

	class Student {
		private String name;

		public Student(String name) {
			this.name = name;
		}

		public void study() {
			System.out.println(name + " is a student");
		}

		public void run() {
			new People("").run();
		}
	}
}
