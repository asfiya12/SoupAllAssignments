package com.soupDoc;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public interface Calculator {
	
	@WebMethod
	int add(int a, int b);
	
	@WebMethod
	int sub(int a, int b);
	
}
