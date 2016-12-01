package com.labs.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	private static final String serializedFile = "/Users/muralipadavala/Desktop/temp/person.ser";
	
	public static void main(String [] args) {
	      
		Person person = new Person();
	      person.setFirstName("FirstName");
	      person.setLastName("LastName");
	      person.setAddress("My Address");
	      person.setPhoneNumber("123-345-3456");
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream(serializedFile);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(person);
	         out.close();
	         fileOut.close();
	         System.out.printf("Person is serialized and writtern to : " + serializedFile);
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	   }
	
}
