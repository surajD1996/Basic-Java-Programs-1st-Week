/******************************************************************************
 *  Purpose	 	contains the logic of all the programs
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	06-08-2017
 *
 ******************************************************************************/



package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{
	
	static Scanner scanner=new Scanner(System.in);

	/**
	 * purpose:	to accept input having data type integer from user
	 * @return	input	returns value provided by user
	 */
	public static int scanInt()
	{
		int value=scanner.nextInt();
		return value;
	}
	
	/**
	 * purpose:	to accept input having data type float from user
	 * @return	input	returns value provided by user
	 */
	public static float scanFloat() 
	{
		float value=scanner.nextFloat();
		return value;
	}
	
	/**
	 * purpose:	to accept input having data type double from user
	 * @return 	input	returns value provided by user 
	 */
	public static double scanDouble()
	{
		double input=scanner.nextDouble();
		return input;
	}
	
	
	/**
	 * purpose:	to accept input having data type String from user
	 * @return	input	returns value provided by user
	 */
	public static String scanString()
	{
		String input=scanner.nextLine();
		return input;
	}
	
	
	/**
	 * purpose:	to reverse words of a string
	 * @param string	string to be reversed
	 * @param length	length of the string
	 * @return reverse	reversed string 
	 */
	public static String printThreeNames(String string[], int length)
	{
		
		String reverse="";
		
		for(int count=length-1;count>=0;count--)
		{
			if(count==0)
				reverse=reverse+"and "+string[count]+".";
			else
				reverse=reverse+string[count]+",";
			
		}
		
		return reverse;
	}
	
	
	public void printInitials()
	{
		
	}
	
	
	
	/**
	 * purpose:	performs arithmetic operations
	 * @param firstNum		1st number to perform operation
	 * @param secondNum		2nd number to perform operation
	 * @param thirdNum		3rd number to perform operation
	 * @return 	answer		returning the final answer of performed operations
	 */
	public static float operationInt(int firstNum, int secondNum, int thirdNum)
	{
		float answer = 0;
		System.out.println("Enter Choice");
		
		System.out.println("1.\t a + b *c\n2.\t a * b + c\n3.\t c + a / b\n4.\t a % b + c.\n\n");
		
		int choice=Utility.scanInt();
		
		switch(choice)
		{
			case 1 :  
			answer=(float) (firstNum + secondNum *thirdNum);
			break; 
		
		
			case 2 :
			answer=(float) (firstNum * secondNum +thirdNum);
			break;
			
			case 3 :
			answer=(float) (thirdNum+firstNum / secondNum );
			break;
			
			case 4 :
				answer=(float) (firstNum % secondNum + thirdNum);
				break;
			
			default :
			System.out.println("Invalid Choice");
		}	
		
		return answer;
	}
	
	
	
	public static double operationDouble(double firstNum, double secondNum, double thirdNum)
	{
		double Answer = 0;
		System.out.println("Enter Choice");
		
		System.out.println("1.\t a + b *c\n2.\t a * b + c\n3.\t c + a / b\n4.\t a % b + c.\n\n");
		
		int choice=Utility.scanInt();
		
		switch(choice)
		{
			case 1 :  
			Answer=(float) (firstNum + secondNum *thirdNum);
			break; 
		
		
			case 2 :
			Answer=(float) (firstNum * secondNum +thirdNum);
			break;
			
			case 3 :
			Answer=(float) (thirdNum+firstNum / secondNum );
			break;
			
			case 4 :
				Answer=(float) (firstNum % secondNum + thirdNum);
				break;
			
			default :
			System.out.println("Invalid Choice");
		}	
		
		return Answer;
	}
	
	public static void leapYear(int year)
	{
		
		if(year<=1582)
		{
			
			return;
		}
		if((year%400)==0)
			System.out.println("It is Leap Year");
		else if((year%100)==0)
			System.out.println("It is not Leap Year");
		else if((year%4)==0)
			System.out.println("It is Leap Year");
		else
			System.out.println("It is not Leap Year");
	}

	public static boolean springSeason(int day, int month)
	{		
		if((day>31)&&((month<3)||(month>6)))
		{
			return false;
		}
		
		if(((month==3)&&(day<20))||
			((month==6)&&(day>20)))
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}
	
	public static void quadratic(double value1, double value2, double value3)
	{
		double root1, root2;
		
		
		double delta = Math.pow(value2,2) - 4 * value1 * value3;
		if(delta > 0)
		{
			System.out.println("Value of Determinant is "+delta+"i.e. greater than 0");
			root1  = (-value2 + Math.sqrt(delta))/(2*value1);
			root2  = (-value2 - Math.sqrt(delta))/(2*value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
		}
		//if delta is ==0
		else if(delta==0)
		{
			System.out.println("Value of Determinant is "+delta+"i.e. equal to 0");
			root1 = root2 = -value2 / (2 * value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
            
		}
		//if delta is <0
		else 
		{
			System.out.println("Value of Determinant is "+delta+"i.e. less than 0");
			root1 = -value2/(2*value1);
			root2 = (Math.sqrt(delta))/(2*value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
		}
	}
	
	/**
	 * purpose:	to find euclidean distance
	 * @param firstNumber	first value to find euclidean distance 
	 * @param secondNumber	second value to find euclidean distance
	 * @return	result		euclidean distance
	 */
	public static double euclideanDistance(int firstNumber, int secondNumber)
	{
		double result = 0;
		
		result = Math.sqrt(Math.pow(firstNumber,2)+Math.pow(secondNumber,2));
		
		return result;
	}
	
	/**
	 * purpose:	to find maximum, minimum, average from the five random numbers
	 * @param randomArray 	it is the array of random numbers ranging from 0 to 1
	 */
	public static void generateRandomRange(double randomArray[])
	{
		if(randomArray==null)
		{
			return;
		}
		int count=0;
		double iMax=0;
		double iMin=1;
		double iAverage=0;
		for(count=0;count<randomArray.length;count++)
		{
			//finding minimum
			iMin=Math.min(randomArray[count], iMin);
			//finding maximum
			iMax=Math.max(randomArray[count], iMax);
			//calculating summation 
			iAverage=iAverage+randomArray[count];
			
			
		}
		//calculating Average
		iAverage=iAverage/5;
		
		System.out.println("Maxium No of the Random numbers is :  "+iMax);
		System.out.println("Minimum No of the Random numbers is :  "+iMin);
		System.out.println("Average of the Random numbers is :  "+iAverage);
				
	}

	/**
	 * purpose:	Calculates the effective temperature  
	 * @param temperature		temperature which should less than 50
	 * @param speed				speed which should be between 3 and 120
	 * @return					effectiveTemperature 
	 */
	public static double windChill(double temperature, double speed) 
	{
		if((temperature > 50) && (( speed < 3) || ( speed > 120)))
		{
			return 0;
		}
		double effectiveTemperature = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * (Math.pow(speed,0.16)); 
		return effectiveTemperature;
	}

	/**
	 * @param celsius
	 * @return
	 */
	public static double temperatureToFahrenit(double celsius) 
	{
		double temperatureInFahrenheit = (celsius * (9/5)) + 32;
		return temperatureInFahrenheit;
	}
	
	
	/**
	 * @param celsius
	 * @return
	 */
	public static float temperatureToCelsius(float celsius) 
	{
		float temperatureInCelsius = (celsius * (9/5)) + 32;
		return temperatureInCelsius;
	}

	/**
	 * @param input
	 */
	public static void happyNumber(int input)
	{
		int digit2=0;
		int temporary=0;
		int sum=0;
		int digit=0;
		int reverse=0;
		
		temporary=input;
		
		while(true)
		{
			sum=0;
			while(temporary!=0)
			{
				digit = temporary%10;
				sum = sum + (digit*digit);
				temporary = temporary / 10;
				
			}
			temporary=sum;
			
			reverse=0;
			while(sum!=0)
			{
				digit2 = sum % 10;
				reverse = reverse * 10 + digit2;
				sum = sum / 10;
			}
			
			if(((temporary % 10 == 0)&&(temporary<10))||(reverse == 1))
			{
				
				break;
			}
			
		}
		
		if(reverse==1)
		{
			System.out.println("Happy");
		}
		else 
		{
			System.out.println("not Happy");
		}		
	}

	/**
	 * purpose : calculate lone amount per month 
	 * @param loanAmount 	principal loan amount
	 * @param years			total years 
	 * @param percentRate	current rate per month
	 * @return				payment per month
	 */
	public static double carLoan(double loanAmount, int years, float percentRate) 
	{
		double rate = percentRate / (12 * 100);
		int months = 12 * years;
		double payment = (loanAmount * rate) / (1 - Math.pow((1 + rate),(-months)));
		return payment;
	}

	/**
	 * @param angle
	 */
	public static void trig(double angle) 
	{
		angle = Math.toRadians(angle);
		System.out.println("Angle is radians is "+angle);
		System.out.println("sin("+angle+(")=")+Math.sin(angle));
		System.out.println("cos("+angle+(")=")+Math.cos(angle));
		
	}

	/**
	 * @param coinTossedArray
	 * @return
	 */
	public static float flipCoin(int coinTossedArray[]) 
	{
		float headPercentage = 0;
		
		int count = 0;
		
		for(count = 0;count < coinTossedArray.length;count++)
		{
			if(coinTossedArray[count]==0)
			{
				headPercentage++;
			}
		}
		
		headPercentage = (headPercentage/coinTossedArray.length)*100;
		
		return headPercentage;
	}

	/**
	 * purpose 	calculates table of the powers of 2 that are less than or equal to 2^n
	 * @param power		is power till we need to calculate the Answer 
	 */
	public static void powerOf2(int power) 
	{
		int count = 0;
		int temporary = 0;
		int answer = 0;
		
		for(count = 1;count<=power;count++)
		{
			temporary = count;
			answer = 1;
			
			while(temporary != 0)
			{
				answer = answer * 2;
				temporary--;
			}
			System.out.println(count+" = "+answer);
		}
		
	}

	public static float harmonicNumber(int endPoint) 
	{
		float answer = 0;
		int count = 0;
		
		for(count = 1;count<=endPoint;count++)
		{
			answer = answer + 1/count;
			System.out.println(answer);
		}
		
		return answer;
	}
	
}






































