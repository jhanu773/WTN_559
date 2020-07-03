package com.wipro.exceptionHandling;
import java.util.Scanner;
public class DivisionExpHandling {
	public static void main(String arg[])
    {  
		try
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter first number : ");
			a=sc.nextInt();
			System.out.print("Enter second number : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		
	}
}