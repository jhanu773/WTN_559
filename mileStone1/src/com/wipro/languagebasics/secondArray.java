package com.wipro.languagebasics;
import java.util.Scanner;
public class secondArray {
	 public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 int max=ar[0];
		 int min=ar[0];
		 for(int i:ar)
			 if(i>max)
				 max=i;
			 else if(i<min)
				 min=i;
		 System.out.println("Max" +max);
		 System.out.println("Min" +min);
	 }
}
