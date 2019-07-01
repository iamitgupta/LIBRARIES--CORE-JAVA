package com.iopack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadBuffer {
	public static void main(String[] args) {
		String loc="C:/Users/Amit/Desktop/FileHandling/demo.txt";
		
			
			File file=new File(loc);
			BufferedReader buffer=null;
			FileReader reader=null;
			
			try {
				reader=new FileReader(file);
		
				buffer=new BufferedReader(reader);
//				int i=buffer.read();
//				while(i!=-1){
//					System.out.print((char)i);
//					i=buffer.read();
//				}
				String s=buffer.readLine();
				System.out.println(s);
				
				
			}catch(Exception e) {
				System.out.println("Exception Occured");
				e.printStackTrace();
			}
			
	}

}
