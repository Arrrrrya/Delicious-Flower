package com.syl.designMode.s3_builder;

public class Product {
	private String part = "";

	public void add(String str) {
		part += (str + " ");
	}

	public void show() {
		System.out.println("product: " + part);
	}
}
