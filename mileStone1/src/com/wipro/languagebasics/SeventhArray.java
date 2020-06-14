package com.wipro.languagebasics;

import java.util.Scanner;

public class SeventhArray {
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
		 System.out.print("Sorted Array: ");
		 for(int i=0;i<n;i++)
			 System.out.print(ar[i]+" ");
		 int[] temp =new int[n];
		 int j=0;
		 for(int i=0;i<n-1;i++)
			 if(ar[i]!=ar[i+1])
				 temp[j++]=ar[i];
		 temp[j++]=ar[n-1];
		 for(int i=0;i<j;i++)
			 ar[i]=temp[i];
		 System.out.println("\nArray without duplicates: ");
		 for(int i=0;i<j;i++)
			 System.out.print(ar[i]+" ");
	}
}
