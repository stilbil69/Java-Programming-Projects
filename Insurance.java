//Filename Insurance.java
//Written by William Bartel
//Written on 10/08/2016

public abstract class Insurance
{
   protected String insType;
   protected double cost;
   
   // Constructor to require an insurance type argument
   public Insurance(String type)
   {
      super();
      insType = type;
   }
   
   // Get method for insurance type
   public String getInsType()
   {
      return insType;
   }
   
   // Get method for monthly insurance price
   public double getCost()
   {
      return cost;
   }
   
   // Abstract method for setting insurance cost
   public abstract void setCost(double cost);
   
   // Abstract method for displaying output
   public abstract void display();
}