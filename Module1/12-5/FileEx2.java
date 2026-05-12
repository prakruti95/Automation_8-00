package com.a125;

import java.io.FileInputStream;
import java.io.IOException;

public class FileEx2 
{
	public static void main(String[] args) throws IOException 
	{
		int ch;
		FileInputStream fin = new FileInputStream("E://xyz.txt");

		 while ((ch = fin.read()) != -1) 
		 {
             System.out.print((char)ch);
         }
	}
}
