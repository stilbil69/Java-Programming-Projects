//Filename TryToParseDouble.java
//Written by William Bartel
//Written on 10/15/2016

import java.util.*;

public class TryToParseDouble
{
   public static void main(String[] args)
   {  
      Scanner input = new Scanner(System.in);
      
      // Prompts user to enter a value
      System.out.print("Enter a double value >> ");

      // Try block to test if user input can be parsed to a double value
      try
      {
         Double value = Double.parseDouble(input.nextLine());
         // Displays successfull parsing string to double value
         System.out.println("String successfully parsed to double value of " + value);
      }
      
      // Catch block forces user input value to zero and displays error message
      catch(NumberFormatException e)
      {
         Double value = 0.00;
         System.out.println("The value you entered is not a double value, so value has been set to " + value);
      }
   }
}