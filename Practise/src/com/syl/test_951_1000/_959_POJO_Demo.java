package com.syl.test_951_1000;

import com.syl.constant.PojoDemo;

public class _959_POJO_Demo {

	public static void main(String[] args) {
		PojoDemo pojoDemo = new PojoDemo();
		pojoDemo.setField1("aaa");
		pojoDemo.setField2("bbb");
		System.out.println(pojoDemo);
		
		String aString = pojoDemo.getField1();
		String bString = pojoDemo.getField2();
		System.out.println(aString + bString);
		
		pojoDemo.field2 = "fff";
		System.out.println(pojoDemo);
		
		String cString = pojoDemo.field2;
		System.out.println(cString);
		

	}

}
