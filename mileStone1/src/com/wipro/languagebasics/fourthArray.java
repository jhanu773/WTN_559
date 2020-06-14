package com.wipro.languagebasics;

import java.util.Scanner;

public class fourthArray {
	public static void main( String args[] ) {
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<n;i++)
			 ar[i]=scan.nextInt();
		 char a=0;
		 int i;
		 for(i=0;i<n;i++) {
			 a=(char)ar[i];
			 System.out.print(ar[i]+"->"+a+",");
		 }
	}

}
