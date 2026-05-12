package com.a125;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) throws IOException 
	{
		String s = "welcome to tops";
		FileOutputStream fout = new FileOutputStream("H://xyz.txt");
		fout.write(s.getBytes());
		System.out.println("Success");
		
	}
}
