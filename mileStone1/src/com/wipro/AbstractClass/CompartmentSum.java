package com.wipro.AbstractClass;
abstract  class CompartmentSum {
	public abstract String notice();
}

class FirstClass extends CompartmentSum{
  public String notice(){
    return "FirstClass";
  }
}

class Ladies extends CompartmentSum{
  public String notice(){
    return "Ladies";
  }
}
class General extends CompartmentSum{
  public String notice(){
    return "General";
  }
}

class Luggage extends CompartmentSum{
  public String notice(){
    return "Luggage";
  }
}