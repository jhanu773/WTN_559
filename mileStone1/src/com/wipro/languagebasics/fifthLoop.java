package com.wipro.languagebasics;
import java.util.Scanner;
public class fifthLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    char char1 =scanner.next().charAt(0);
	    if(char1>=48 && char1<=57)
	    {
	        System.out.print(" Digit");

	    }
	    else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
	    {
	        System.out.print(" Alphabet");
	    }
	    else
	    {
	        System.out.print(" special character");
	}
	}
}
