
package com.bridgelabz.functional;





import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintThreeNames 
{
	public static void main(String arg[])  
	{
		//Scanner scanner=new Scanner(System.in); do not need to all bcz function in utilities
		
		System.out.println("Enter The String");
		
		//String names=scanner.nextLine();  do not need to all bcz function in utilities
		
		//Utility utility=new Utility();  do not need to create object bcz functions are static 
		
		//calling function directly by using class name as they are static
		
		String value=Utility.scanString();
		
		String string[]=value.split("\\s");
		
		int length=string.length;
		
		//calling function directly by using class name as they are static
		
		String answer=Utility.printThreeNames(string,length);
		
		System.out.println("Hi "+answer);
		
	}

}
