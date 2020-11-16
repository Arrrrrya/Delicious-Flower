package com.syl.designMode.s3_builder;

public class TestBuilder {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new Builder1();
		director.Construct(b1);
		Product product = b1.getProduct();
		product.show();
	}
}
