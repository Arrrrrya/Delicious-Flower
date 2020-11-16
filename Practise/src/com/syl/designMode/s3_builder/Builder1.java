package com.syl.designMode.s3_builder;

public class Builder1 extends Builder {
	Product product = new Product();

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("partA");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("partB");
	}
	
	public Product getProduct() {
		return product;
	}

}
