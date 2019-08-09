
/******************************************************************************
 *  Purpose	 	Defines Entered number is Happy or Not
 *  @author  	Suraj Warbhuvan
 *  @version 	1.0
 *  @since   	09-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HappyNumber 
{

	public static void main(String[] args) 
	{
		int input=0;
		System.out.println("Enter The Number");
		input=Utility.scanInt();
		System.out.println("You Entered  "+input);
		Utility.happyNumber(input);
	}

}
