//Filename CabinRental.java
//Written by William Bartel
//Written on 09/29/2016

public class CabinRental
{
   // Initializing variables for cabin number and weekly cabin rental rate
   private int cabinNumber;
   protected double weeklyRate;
   
   // Constructor that requires an integer for the cabin number
   CabinRental(int num)
   {
      this.cabinNumber = num;
      
      // Setting weekly rate of cabin rental based on cabin number
      if(cabinNumber > 0 || cabinNumber < 4)
      {
         this.weeklyRate = 950.00;
      }
      if(cabinNumber > 3)
      {
         this.weeklyRate = 1100.00;
      }
   }
   // Getter for cabin number, returns cabin number
   public int getCabinNumber()
   {
      return this.cabinNumber;
   }
   // Getter for weekly rate, returns weekly cabin rental rate
   public double getWeeklyRate()
   {
      return this.weeklyRate;
   }
}