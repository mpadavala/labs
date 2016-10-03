package com.labs.privatemethodtesting;

public class PrivateMethodClass {

	public String getStringFromPublicMethod() {
		return "String from Public Method";
	}

	public String getAllStrings() {
		String s1 = getStringFromPublicMethod();
		String s2 = getStringFromPrivateMethod();

		return s1 + "; " + s2 + getStringFromPrivateMethod("test");
	}

	private String getStringFromPrivateMethod() {
		return "String from Private Method";
	}

	private String getStringFromPrivateMethod(String str) {
		return "String from Private Method : " + str;
	}

}
