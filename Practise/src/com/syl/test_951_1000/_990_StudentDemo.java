package com.syl.test_951_1000;

/**
 * 
 * @question 编写一个学生类,提供name、age、gender、phone、address,email成员变量,且为每个成员变量提供setter、getter方法。为学生类提供默认的构造器和带所有成员变量的构造器。为学生类提供方法,用于描绘吃、喝、玩、睡等行为。
 * @link https://www.nowcoder.com/questionTerminal/37bcad1094174b8eb3f5ee7c28b2d59c
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _990_StudentDemo {
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;

	public void doEverything() {
		System.out.println("do nothing");
	}

	public _990_StudentDemo() {
		super();
	}

	public _990_StudentDemo(String name, int age, String gender, String phone, String address, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public _990_StudentDemo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "_010_StudentDemo [name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", address=" + address + ", email=" + email + "]";
	}

}
