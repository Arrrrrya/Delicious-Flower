package com.syl.designMode.s3_builder;

public class Director {
	public void Construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
