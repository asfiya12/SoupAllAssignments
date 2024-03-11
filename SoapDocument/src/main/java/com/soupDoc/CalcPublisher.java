package com.soupDoc;

import jakarta.xml.ws.Endpoint;

public class CalcPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/calc", new CalculatorImpl());
		System.out.println("Running the calculator Publisher");

	}

}
