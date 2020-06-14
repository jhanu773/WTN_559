package com.wipro.languagebasics;
import java.util.Scanner;
public class twelfthLoop {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int flag=0;
	for(int i=1;i<=Math.sqrt(n);i++)
	{
	if(n%i==0)
	{
	flag++;
	}
	}
	if(flag==1)
	{
	System.out.println("Prime");
	}
	else
	{
	System.out.println("Not Prime");
	}
	}
}
