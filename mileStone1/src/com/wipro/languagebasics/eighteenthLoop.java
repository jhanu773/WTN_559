package com.wipro.languagebasics;
import java.util.Scanner;
public class eighteenthLoop {
	public static void main(String[] args) {
		 int n= Integer.parseInt(args[0]);
		 int temp=n;
		 int a=0,rem;
		 while(temp!=0) {
			 rem=temp%10;
			 a=a*10+rem;
			 temp=temp/10;
		 }
		 if(n==a)
		 {
			 System.out.print(n+" is a palindrome");
		 }
		 else
		 {
			 System.out.print(n+" is not a palindrome");
		 }			
}
}
