package com.ws.soup1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	String getHelloWorld(String name);

}
