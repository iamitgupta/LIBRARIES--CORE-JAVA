package com.iopack;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileStream {

	public static void main(String[] args) {
		String loc="C:/Users/Amit/Desktop/FileHandling/myfile.txt";
		
			
			File file=new File(loc);
			FileInputStream fin=null;
			FileOutputStream fout=null;
			String a= "Amit gupta";
			byte b[]=a.getBytes();
			
			String c= "Dev";
			byte d[]=c.getBytes();
			
			try {
				fin=new FileInputStream(file);
				fout=new FileOutputStream(file);
				
				fout.write(b);
				fout.write(d);
				int i=fin.read();
				while(i!=-1){
					System.out.print((char)i);
					i=fin.read();
				}
				
			}catch(Exception e) {
				System.out.println("Exception Occured");
				e.printStackTrace();
			}
	}

}
