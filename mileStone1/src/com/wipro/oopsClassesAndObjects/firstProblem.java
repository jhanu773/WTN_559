package com.wipro.oopsClassesAndObjects;

public class firstProblem {
	double H,W,D;

    firstProblem(double Height,double Width ,double Depth)
	 {
   	 H=Height;
	     W=Width;
	     D=Depth;
	 }
	    double volume()
	    { 
	    	double volume;
	        volume=H*W*D;
	        return volume;
	    }
	    public static void main(String[] args) 
	    {
	    	firstProblem box = new firstProblem(7.5,77.3,7.6);
	        System.out.println(box.volume());
	    }
}