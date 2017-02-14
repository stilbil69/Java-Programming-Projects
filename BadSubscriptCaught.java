//Filename BadSubscriptCaught.java
//Written by William Bartel
//Written on 10/15/2016

import java.util.*;

public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
      // Declaring a string array of 10 first names
      String firstNames[] = {"Anna", "Bill", "Christy", "David", "Eric", "Frank", "Gloria", "Helen", "Issak", "Jennifer"};
      
      // Declaring an integer value for user input as num
      int num;
      
      Scanner input = new Scanner(System.in);
      
      // Printing out the array of first names
      System.out.println(Arrays.toString(firstNames));
      
      // Prompt user to enter an integer respresenting
      // the position of the name in the array and stores the integer
      System.out.print("Enter the position of a name in the array >> ");
      num = input.nextInt();
      
      // Try block to prompt user for an integer and display corresponding first name
      try
      {
         // Creates int variable for user input value and subtracts 1 to find index value in array
         int index = (num - 1);
      
         System.out.print("You entered " + num + ". The corresponding first name is " + firstNames[index]);
      }
      
      // Catch block for potential out of bounds exception
      catch(ArrayIndexOutOfBoundsException e)
      {
         // Displays error message for out of bounds exception
         System.out.println("You have entered an incorrect value");
      }
   }
}