package com.wipro.languagebasics;

public class firstArray {
	 public static void main( String args[] ) {
		 int ar[] =new int[]{1,2,3,4,5};
		 int sum=0;
		 float a=0.0f;
		 for(int elements:ar)
			 sum = sum+elements;
		 a=(float)sum/ar.length;
		 System.out.println(sum+" "+a);
	 }
}
