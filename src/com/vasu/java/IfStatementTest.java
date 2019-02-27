package com.vasu.java;

import java.util.Scanner;

public class IfStatementTest 
{
	public static void main(String[] args)
	{
		//int n=46;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}
				

	}

}
