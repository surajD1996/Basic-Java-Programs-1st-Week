package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class IntOpt 
{
	public static void main(String arg[])
	{
		System.out.println("Enter Three Numbers for Operation");
		int firstNum=Utility.scanInt();
		int secondNum=Utility.scanInt();
		int thirdNum=Utility.scanInt();
		
		float Answer=Utility.operationInt(firstNum,secondNum,thirdNum);
		System.out.println(firstNum+"+"+secondNum+"*"+thirdNum+"="+Answer);
	}

}
