package com.juaracoding.ujian6.utils;

public enum TestCases {

	T1("Testing registration page"),
	T2("Testing login Page"),
	T3("Testing add to Cart"),
	T4("Testing checkout items");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
