package com.labs.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialzationDemo {
	
	private static final String serializedFile = "/Users/muralipadavala/Desktop/temp/person.ser";
	

	 public static void main(String [] args) {
	      Person person = null;
	      try {
	         FileInputStream fileIn = new FileInputStream(serializedFile);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         person = (Person) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c) {
	         System.out.println("Person class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Person data :");
	      System.out.println("First Name : " + person.getFirstName());
	      System.out.println("Last Name : " + person.getLastName());
	      System.out.println("Address : " + person.getAddress());
	      System.out.println("Phone Number : " + person.getPhoneNumber());
	   }
	 
}
