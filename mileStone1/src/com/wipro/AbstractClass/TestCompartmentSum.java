package com.wipro.AbstractClass;
import java.util.Random;
public class TestCompartmentSum {
	public static void main(String[] args) {
	      CompartmentSum[] c=new CompartmentSum[10];
	      Random rand=new Random();
	      for(int i=0;i<10;i++) {
	        int r=1+rand.nextInt(4);
	        if(r==1) {
	          c[i]=new FirstClass();
	          System.out.println(c[i].notice());
	        }
	        else if(r==2) {
	          c[i]=new Ladies();
	          System.out.println(c[i].notice());
	        }
	        else if(r==3) {
	          c[i]=new General();
	          System.out.println(c[i].notice());
	        }
	        else {
	          c[i]=new Luggage();
	          System.out.println(c[i].notice());
	        }
	      }
	    }
	  }