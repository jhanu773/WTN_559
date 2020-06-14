package com.wipro.languagebasics;

import java.util.Scanner;

public class sixthArray {
	public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 for(int i=0;i<n-1;i++)
			 for(int j=0;j<n-i-1;j++)
				 if(ar[j]>ar[j+1]) {
					 int temp=ar[j];
					 ar[j]=ar[j+1];
					 ar[j+1]=temp;
				 }
		 for(int i=0;i<n;i++)
			 System.out.print(ar[i]+" ");
	}

}
