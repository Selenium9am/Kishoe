package com.vasu.excel;

public class MethodTest
{
	//with retun type with parameters
	public void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		MethodTest v=new MethodTest();
		v.add(); //calling method with method name //it won't return a value
		/*int res=v.add();//calling a method with variable it will return a value
		System.out.println(res);*/
	}
}
