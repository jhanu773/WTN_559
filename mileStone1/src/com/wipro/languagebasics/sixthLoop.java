package com.wipro.languagebasics;

public class sixthLoop {
	public static void main(String args[]) {
		String gen=args[0];
		int age=Integer.parseInt(args[1]);
		if(gen.contentEquals("female")) {
			if(age>=1&&age<=58)
			{
				System.out.println("interest=8.2 %");
			}
			else if(age>59 &&age<=100)
			{
				System.out.println("interest=9.2 %");
			}
		}
			if(gen.contentEquals("male"))
			{
				if(age>=1 &&age<=58)
				{
					System.out.println("interest=8.4 %");
				}
				else if(age>59 &&age<=100)
				{
					System.out.println("interest=10.5 %");
				}
			}
	}
}
