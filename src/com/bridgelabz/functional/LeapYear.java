package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear 
{
	public static void main(String arg[])
	{
		System.out.println("Enter The Year");
		int year=Utility.scanInt();
		Utility.leapYear(year);
		
	}
}