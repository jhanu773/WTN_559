package com.wipro.languagebasics;
import java.util.Scanner;
public class firstLoop {
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	     int i = myObj.nextInt();
	     if(i>0)
	      System.out.println("The given number is a positive Number");
	     if(i<0)
	      System.out.println("The given number is a negative Number");
	     if(i==0)
	      System.out.println("The given number is zero");
	}
}
