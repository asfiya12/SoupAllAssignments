package com.ws.soup1;

import jakarta.xml.ws.Endpoint;

public class HelloPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8001/ws/hello", new HelloWorldImpl());
		System.out.println("Hello publisher running");

	}

}
