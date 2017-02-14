//Filename HolidayCabinRental.java
//Written by William Bartel
//Written on 09/29/2016

import java.util.*;

public class HolidayCabinRental extends CabinRental
{
    // Initializing date variable for a room number
    private int roomNumber;
    
    // Constructor that requires a cabin number and room number
    HolidayCabinRental(int cabinNumber, int roomNumber)
    {
      super(cabinNumber);
      super.weeklyRate = super.getWeeklyRate() + 150;
      this.roomNumber = roomNumber;
    }
    // Getter for room number, returns room number
    public int getRoomNumber()
    {
      return this.roomNumber;
    }
}