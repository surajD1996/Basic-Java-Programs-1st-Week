/******************************************************************************
 *  Purpose:    performing operations to understand operator precedence on double
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class DoubleOpt 
{
	public static void main(String arg[])
	{
		double answer;
		System.out.println("Enter First Number");
		double firstNumber=Utility.scanDouble();
		System.out.println("Enter Second Number");
		double secondNumber=Utility.scanDouble();
		System.out.println("Enter Third Number");
		double thirdNumber=Utility.scanDouble();
		answer=Utility.operationDouble(firstNumber,secondNumber,thirdNumber);
		System.out.println(firstNumber+"+"+secondNumber+"*"+thirdNumber+"="+answer);
	}
}
