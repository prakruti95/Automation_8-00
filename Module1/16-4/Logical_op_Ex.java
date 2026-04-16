package com.a164;

// && , || , !
public class Logical_op_Ex 
{
	public static void main(String[] args) 
	{
		String email = "a@gmail.com";
		String pass = "1234";
	
		String email2 = "a@gmail.com";
		String pass2 = "1234";
		
		String email3 = "a@gmail.com";
		String pass3 = "12345";
		
		System.out.println(email==email2 && pass==pass2);
		System.out.println(email==email3 || pass==pass3);
		System.out.println(!(pass==pass3));
	}
}
