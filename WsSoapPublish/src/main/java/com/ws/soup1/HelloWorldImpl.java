package com.ws.soup1;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.ws.soup1.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorld(String name) {
		return "Hello! "+name;
	}

}
