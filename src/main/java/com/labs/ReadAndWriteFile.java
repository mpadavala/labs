package com.labs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAndWriteFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String filePath = "/Users/muralipadavala/Desktop/testfile.txt";

		List<String> list = new ArrayList<>();
		
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				list.add(line);
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.println("OUTPUT");
		System.out.println("");
		
		Collections.reverse(list);
		
		try {
			File outputFile = new File("/Users/muralipadavala/Desktop/testfile-out.txt");
	
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}
	
			FileWriter fw = new FileWriter(outputFile.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
	
			for (String str : list) {
				System.out.println(str);
				bw.write(str + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}