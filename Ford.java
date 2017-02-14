//Filename Ford.java
//Written by William Bartel
//Written on 10/07/2016

public class Ford extends Auto
{
   // Constructor to set car make and call setCarPrice method
   public Ford()
   {
      super("Ford");
      setCarPrice();
   }
   
   // Set method to set car price
   public void setCarPrice()
   {
      price = 20000.00;
   }
   
   // Output for displaying car make and price
   public void display()
   {
      System.out.println("The " + carMake + " costs $" + price);
   }
}