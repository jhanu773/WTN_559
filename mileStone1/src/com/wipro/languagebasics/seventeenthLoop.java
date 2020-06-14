package com.wipro.languagebasics;

public class seventeenthLoop {
	public static void main(String[] args) {
		 int n= Integer.parseInt(args[0]);
		 int r;
		 while(n!=0) {
			 r=n%10;
			 System.out.print(r);
			 n=n/10;
		 } 
	}
}
