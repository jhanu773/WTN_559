package com.wipro.languagebasics;

import java.util.Scanner;

public class eighthArray {
	public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 int flag=0;
		 int sum=0;
		 for(int i:ar) {
			 if(i==6)
				 flag=1;
			 if(flag==1)
			 {
				 if(i==7)
					 flag=0;
				 continue;
			 }
			 else {
				 if(i==7)
					 sum+=i+6;
				 else
					 sum+=i;
			 }
		 }
	 System.out.println(+sum);
	}
}
