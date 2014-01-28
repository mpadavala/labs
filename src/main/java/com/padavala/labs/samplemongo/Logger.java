package com.padavala.labs.samplemongo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	public static void main(String[] args) {
		logToFile("/Users/mpadavala/test/log");
	}

	public static void logToFile(String filePath) {
		BufferedWriter bw = null;
		try {
			String content ="test";
			
			File file = new File(filePath);
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			int counter=0;
			while(true){
				
				bw = new BufferedWriter(fw);
				bw.write(content+counter+++"\n");
				bw.flush();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			


		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
