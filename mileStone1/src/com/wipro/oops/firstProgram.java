package com.wipro.oops;

public class firstProgram {
	 double H,W,D;

     firstProgram(double Height,double Width ,double Depth)
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
	    	firstProgram box = new firstProgram(7.5,77.3,7.6);
	        System.out.println(box.volume());
	    }
}
