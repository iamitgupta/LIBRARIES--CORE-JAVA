package com.iopack;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		String loc="C:/Users/Amit/Desktop/FileHandling/demo.txt";
		
		File file=new File(loc);
		
		try {
			file.createNewFile();
			System.out.println("File created");
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}

}
