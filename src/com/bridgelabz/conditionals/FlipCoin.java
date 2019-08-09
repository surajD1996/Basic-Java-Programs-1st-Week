package com.bridgelabz.conditionals;

import java.util.Random;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		int numberOfTosses = Utility.scanInt();
		float headPercentage=0;
		float tailPercentage=0;
		int count = 0;
		int coinTossedArray[]= new int[numberOfTosses]; 
		Random random = new Random();
		System.out.println("Coin is tossed "+numberOfTosses+("times"));
		
		for(count = 0; count < numberOfTosses; count++)
		{
			 coinTossedArray[count] =  0 + (int)random.nextInt(2);
		}
		
		headPercentage = Utility.flipCoin(coinTossedArray);
		System.out.println("Head Win = "+headPercentage);
		System.out.println("Tail5 Win = "+(100 - headPercentage));
		
		
		
		
		
				
	}

}
