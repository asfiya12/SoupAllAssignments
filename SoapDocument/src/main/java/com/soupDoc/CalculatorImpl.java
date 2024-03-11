package com.soupDoc;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.soupDoc.Calculator")
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}
	
}
