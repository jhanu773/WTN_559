package com.wipro.languagebasics;

public class ninteenthLoop {
	public static void main(String[] args) {
		int n=0,i=1;
		while(n<5) {
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i);
				n++;
			}
			i++;
		}
	}

}
