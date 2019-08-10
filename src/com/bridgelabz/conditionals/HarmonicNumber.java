
/******************************************************************************
 *  Purpose	 	To Harmonic Number
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	10-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.conditionals;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
		int endPoint = Integer.parseInt(args[0]);
		float answer = 0;
		System.out.println("Yo Entered "+endPoint);
		
		answer = Utility.harmonicNumber(endPoint);
		
		System.out.println("Harmonic Number is "+answer);
	}

}
