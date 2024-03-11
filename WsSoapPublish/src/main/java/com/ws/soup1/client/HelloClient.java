package com.ws.soup1.client;


import jakarta.xml.ws.Service;

 
import javax.xml.namespace.QName;

import com.ws.soup1.HelloWorld;

import java.net.URL;
 

public class HelloClient {

	public static void main(String[] args) throws Exception { 
		
		URL url = new URL("http://localhost:8001/ws/hello?wsdl");
		QName qname=new QName("http://soup1.ws.com/","HelloWorldImplService");
		Service service = Service.create(url,qname);
		HelloWorld port = service.getPort(HelloWorld.class);
		System.out.println(port.getHelloWorld("Asfiya"));
	
	}

}
