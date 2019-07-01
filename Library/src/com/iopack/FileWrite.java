package com.iopack;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		String loc="C:/Users/Amit/Desktop/FileHandling/demo.txt";
		
		File file=new File(loc);
		FileWriter writer=null; 
		
		try {
			writer=new FileWriter(file);
			writer.write("This is demo text");
			System.out.println("Written successfully");
			writer.close();
			
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}

}
