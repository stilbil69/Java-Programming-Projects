//Filename Chevy.java
//Written by William Bartel
//Written on 10/07/2016

public class Chevy extends Auto
{
   // Constructor to set car make and call setCarPrice method
   public Chevy()
   {
      super("Chevy");
      setCarPrice();
   }
   
   // Set method to set car price
   public void setCarPrice()
   {
      price = 22000.00;
   }
   
   // Output for displaying car make and price
   public void display()
   {
      System.out.println("The " + carMake + " costs $" + price);
   }
}