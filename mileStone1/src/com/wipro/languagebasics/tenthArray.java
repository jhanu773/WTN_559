package com.wipro.languagebasics;
import java.util.Arrays;
public class tenthArray {
	public static void main(String[] args)
	 {
	  int a[]= new int[] {0,1,1,0,0,1,1};
	  int i;
	  for(i=0;i<a.length;i++)
	  {
	   if(a[i]%2==0)
	   {
	    System.out.print(a[i]+" ");
	   }
	  }
	  for(i=0;i<a.length;i++)
	  {
	   if(a[i]%2!=0)
	   {
	    System.out.print(a[i]+" ");
	   }
	  }
	 }
	}