package com.wipro.languagebasics;

import java.util.Scanner;

public class thirdArray {
	 public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 System.out.println("enter the element");
		 int element=scan.nextInt();
		 int flag=0,i;
		 for(i=0;i<n;i++)
			 if(ar[i]==element) {
				 flag=1;
		         break;
			 }
		 if(flag==1)
			 System.out.println(element+ " at position "+(i+1));
		 else
			 System.out.println(-1);
		 
	 }

}
