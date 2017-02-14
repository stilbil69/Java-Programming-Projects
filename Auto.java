//Filename Auto.java
//Written by William Bartel
//Written on 10/07/2016

public abstract class Auto
{
   // Created fields for make of car and car price
   protected String carMake;
   protected double price;
   
   // Constructor for auto class to accept arguments
   public Auto(String make)
   {
      carMake = make;
   }

   // Get method for make of car
   public String getCarMake()
   {
      return carMake;
   }
   
   // Get method for price of car
   public double getPrice()
   {
      return price;
   }
   
   // Set method for make of car
   public void setCarMake(String make)
   {
      carMake = make;
   }
   
   // Abstract method to set price of car
   public abstract void setCarPrice();
}