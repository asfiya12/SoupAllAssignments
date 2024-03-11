package com.ws.soup1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface HelloWorld {
	@WebMethod
	String getHelloWorld(String name);

}
