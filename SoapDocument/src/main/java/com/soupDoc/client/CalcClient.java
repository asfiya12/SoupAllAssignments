package com.soupDoc.client;

import java.net.URL;

import javax.xml.namespace.QName;

import com.soupDoc.Calculator;

import jakarta.xml.ws.Service;

public class CalcClient{
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8888/ws/calc?wsdl");
		QName qname=new QName("http://soupDoc.com/","CalculatorImplService");
		Service service = Service.create(url,qname);
		Calculator port = service.getPort(Calculator.class);
		System.out.println(port.add(10, 20));
	}

}
