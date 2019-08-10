
/******************************************************************************
 *  Purpose	 	To Find square root by using newtons method
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	10-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionals;

public class Sqrt 
{

	public static void main(String[] args) 
	{
		int i=0,j=0;
		for(i=1;i<4;i++)
		{
			for(j=1;j<7;j++)
			{
				if((j>=5-i)&&(j<=3+i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}