package com.wipro.oopsClassesAndObjects;

public class secondOne {
	public static void main(String[] args) {
		System.out.println(Calculator.powerDouble(13.89,4));
		System.out.println(Calculator.powerInt(16,8));	
	}
}
class Calculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
}

