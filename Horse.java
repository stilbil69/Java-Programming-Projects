//Filename Horse.java
//Written by William Bartel
//Written on 09/28/2016

public class Horse
{
   // Initializing variables for horses name, color, and birth year
   private String horseName;
   private String horseColor;
   private int horseBirthYear;
   
   // Getter for horses name
   public String getHorseName()
   {
      return horseName;
   }
   
   // Getter for horses color
   public String getHorseColor()
   {
      return horseColor;
   }
   
   // Getter for horses birth year
   public int getHorseBirthYear()
   {
      return horseBirthYear;
   }

   // Setter for horses name  
   public void setHorseName(String name)
   {
      horseName = name;
   }

   // Setter for horses color   
   public void setHorseColor(String color)
   {
      horseColor = color;
   }

   // Setter for horses birth year
   public void setHorseBirthYear(int year)
   {
      horseBirthYear = year;
   }
   
   // Method used to display header for user input horse stats
   public void displayHorseInfo()
   {
      System.out.println();
      System.out.println("HORSE INFORMATION & RACE STATS");
      System.out.println("------------------------------");
   }
}
