package com.wipro.languagebasics;
import java.util.Scanner;
public class fourthLoop {
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	     char AO = myObj.next().charAt(0);
	     char AO1 = myObj.next().charAt(0);
	     int i =  (int)AO;
	     int j =  (int)AO1;
	     if(i < j)
	     {
	       System.out.println(AO+","+AO1);
	       System.exit(0); 
	     }
	     System.out.println(AO1+","+AO);
	}
}
