package com.vasu.java;

public class StringValidationTest 
{
	public static void main(String[] args) 
	{
		String value1="Selenium Training";
		String value2="Kishore";
		
		if (value1.contains(value2)) 
		{
			System.out.println("Exist");
		}else
		{
			System.out.println("not exist");
		}

	}

}
