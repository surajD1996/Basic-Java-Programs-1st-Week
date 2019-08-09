/******************************************************************************
 *  Purpose: Gives the average of random numbers from range 0-1
 *  @author  Suraj Warbhuvan
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/



package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter How Many Random Numbers You Want");
		int randomCount=Utility.scanInt();
		double randomArray[]=new double[randomCount];
		for(int count=0;count<randomArray.length;count++)
		{
			randomArray[count]=Math.random();
			System.out.println((count+1)+"st RandomNumber is "+randomArray[count]);
		}
		Utility.generateRandomRange(randomArray);
		
	}

}
