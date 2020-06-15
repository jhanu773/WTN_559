package com.wipro.languagebasics;
import java.util.Arrays;
public class thirteenthArray {
	public static void main(String[] args)
	 {
	  int a[][]=new int[20][20];
	  int i,j;
	  for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	   {
	    a[i][j]=Integer.valueOf(args[3*i+j]);
	   }
	  }
	  System.out.println("Given array is: ");
	  for(i=0;i<3;i++)
	  {
	   for(j=0;j<=3;j++)
	   {
	    System.out.print(a[i][j]);
	    
	   }
	   System.out.println("");
	  }
	 
	  System.out.println("Reversed array is: ");
	  for(i=2;i>=0;i--)
	  {
	   for(j=2;j>=0;j--)
	   {
	    System.out.print(a[i][j]);
	    
	   }
	   System.out.println("");
	  }
	 }
	}