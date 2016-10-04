package com.labs.designpatterns.creationalpatterns.abstractfactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryExample {

	public static void main(String[] args) {
		
		String xmlString = "<document><body><element>ABC</element></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xmlString.getBytes());
		
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder factory = abstractFactory.newDocumentBuilder();
			Document document = factory.parse(bais);
			document.getDocumentElement().normalize();
			
			System.out.println("Root element : " + document.getDocumentElement().getNodeName());
			System.out.println("first element text : " + document.getElementsByTagName("element").item(0).getTextContent());
			
			System.out.println(abstractFactory.getClass());
			System.out.println(factory.getClass());

			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
