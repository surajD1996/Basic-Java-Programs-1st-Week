
/******************************************************************************
 *  Purpose	 	To find Power of 2
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	10-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionals;

import com.bridgelabz.utility.Utility;

public class PowerOf2 
{

	public static void main(String[] args) 
	{
		int power = Integer.parseInt(args[0]);
		System.out.println("You Entered "+power);
		Utility.powerOf2(power);
	}

}
