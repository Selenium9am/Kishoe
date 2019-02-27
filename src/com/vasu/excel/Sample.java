package com.vasu.excel;

import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws Exception
	{
		XLUtils app=new XLUtils();
		//int rcnt=app.getRowCount("C:\\Users\\vasu\\Desktop\\TestData.xlsx", "Sheet1");
		//System.out.println(rcnt);
		int col=app.getCellCount("C:\\Users\\vasu\\Desktop\\TestData.xlsx", "Sheet1", 0);
System.out.println(col);
	
	}

}
