package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SpringSeason 
{
	public static void main(String arg[])
	{
	
		System.out.println("Enter Date \n");
		int day= Utility.scanInt();
		System.out.println("Enter Month \n");
		int month= Utility.scanInt();
		boolean Answer=Utility.springSeason(day,month);
		if(Answer==true)
		{
			System.out.println("It is Spring Season");
		}
		else
		{
			System.out.println("It is not Spring Season");
		}		
	}

}
