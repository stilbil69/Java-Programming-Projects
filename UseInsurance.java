//Filename UseInsurance.java
//Written by William Bartel
//Written on 10/08/2016

import java.util.Scanner;

public class UseInsurance
{
   public static void main(String[] args)
   {
      Health health = new Health();
      Life life = new Life();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please select an insurance type (1 - Health, 2 - Life): ");
      int userInt = keyboard.nextInt();
      
      if(userInt == 1)
         health.display();
      else if(userInt == 2)
         life.display();
   }
}