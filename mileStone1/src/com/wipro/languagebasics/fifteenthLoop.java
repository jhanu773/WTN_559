package com.wipro.languagebasics;
import java.util.Scanner;
public class fifteenthLoop {
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    
	    int alpha=myObj.nextInt();
	    int i,sum=0;
	    
	    for(;alpha!=0;alpha/=10)
	        sum+=alpha%10;
	    
	           System.out.println(sum);     
	    }
}
