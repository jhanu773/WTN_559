package com.wipro.languagebasics;

import java.util.Scanner;

public class thirteenLoop {
	public static void main(String[] args) {
		int temp,i;
		for(i=0;i<=99;i++)
		{
			temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=1;
					break;
				}
			}
			if(temp==0)
				System.out.println("\n"+i);
		}
}
}
