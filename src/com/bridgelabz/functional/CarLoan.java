package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CarLoan 
{

	public static void main(String[] args) 
	{
		double loanAmount = Double.parseDouble(args[0]);
		int years = Integer.parseInt(args[1]);
		float percentRate = Float.parseFloat(args[2]);
		
		double payment = Utility.carLoan(loanAmount, years, percentRate);
		
		System.out.println("Amount is "+payment );
		
	}

}
