package com.iopack;

import java.io.File;
import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) {
		String loc="C:/Users/Amit/Desktop/FileHandling/demo.txt";
		
			
			File file=new File(loc);
			FileReader reader=null;
			
			try {
				reader=new FileReader(file);
				int i=reader.read();
				
				while(i!=-1){
					System.out.print((char)i);
					i=reader.read();
				}
			}catch(Exception e) {
				System.out.println("Exception Occured");
				e.printStackTrace();
			}
			
	}

}
