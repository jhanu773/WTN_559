package com.wipro.languagebasics;
import java.util.Arrays;
public class ninthArray {
	static void movezeroes(int arr[],int n)
	 {
	  int c=0,temp;
	  for(int i=0;i<n;i++)
	  {
	   if(arr[i]!=0)
	   {
	    temp=arr[c];
	    arr[c]=arr[i];
	    arr[i]=temp;
	    c++;
	   }
	  }
	 }
	 public static void main(String[] args)
	 {
	  int a[]=new int[] {1,10,2,10};
	  int i;
	  for(i=0;i<a.length;i++)
	  {
	   if(a[i]==10)
	   {
	    a[i]=a[i]%10;
	   }
	  }
	 Arrays.parallelSort(a);
	 
	 movezeroes(a,a.length);
	 System.out.println();
	 for(i=0;i<a.length;i++)
	  System.out.println(a[i]+" ");
	 }
	}