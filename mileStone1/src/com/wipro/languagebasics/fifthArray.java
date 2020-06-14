package com.wipro.languagebasics;

import java.util.Scanner;

public class fifthArray {
	public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 int max1,max2,min1,min2;
		 max1=max2=Integer.MIN_VALUE;
		 min1=min2=Integer.MAX_VALUE;
		 for(int i=0;i<n;i++) {
			 if(ar[i]>max1) {
				 max2=max1;
				 max1=ar[i];
			 }
			 else if(ar[i]>max2)
				 max2=ar[i];
		 }
		 System.out.println("largest: "+max1+" &"+max2);
		 for(int i=0;i<n;i++) {
			 if(ar[i]<min1) {
				 min2=min1;
				 min1=ar[i];
			 }
			 else if(ar[i]<min2)
				 min2=ar[i];
		 }
		 System.out.println("smallest: "+min1+" &"+min2);	 
	}
}
