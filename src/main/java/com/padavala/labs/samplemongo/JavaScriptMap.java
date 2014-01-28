package com.padavala.labs.samplemongo;


public class JavaScriptMap {

	public static void main(String args[]){
		createArray();
	}
	
	private static void createArray(){
		
		
		String keys[] = {	"E040",
			"E045",
			"E050",
			"E053",
			"E056",
			"E059",
			"E062",
			"E065",
			"E071",
			"E074",
			"E077",
			"E080",
			"E083",
			"E086",
			"E089",
			"E092",
			"E095",
			"E098",
			"E101",
			"E104",
			"E107",
			"E110",
			"E113",
			"E116",
			"E119",
			"E145",
			"E149",
			"E153",
			"E161",
			"E164",
			"E168",
			"E174",
			"E175",
			"E181",
			"E188",
			"E189",
			"E190",
			"E199",
			"E203",
			"E207",
			"E211",
			"E215",
			"E219",
			"E223",
			"E227",
			"E230",
			"E233",
			"E237",
			"E241",
			"E246",
			"E249",
			"E255",
			"E259"
		};
		
		StringBuffer sb = new StringBuffer("var entities = [");
		
		for(int i=0; i< keys.length; i++){
			sb.append("\"");
			sb.append(keys[i]);
			sb.append("\",");			
		}
		sb = new StringBuffer(sb.toString().substring(0, sb.length()-1));
		sb.append("];");
		System.out.println(sb.toString());
	}
}
