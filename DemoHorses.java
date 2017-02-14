//Filename DemoHorses.java
//Written by William Bartel
//Written on 09/28/2016

import java.util.*;

public class DemoHorses
{
   public static void main(String[] args)
   {
      // Initializing data variables for horses name, color, birth year,
      // number of races completed, and its place in last race completed
      String name;
      String color;
      int year;
      int races;
      int place;
      
      Horse aHorse = new Horse();
      RaceHorse aRaceHorse = new RaceHorse();
      
      Scanner keyboard = new Scanner(System.in);
      
      // Prompts for user input and storing of horses name, color, birth year,
      // races completed, and place in last race completed
      System.out.print("Enter the horses name: ");
      name = keyboard.nextLine();
      aHorse.setHorseName(name);
      
      System.out.print("Enter the horses color: ");
      color = keyboard.nextLine();
      aHorse.setHorseColor(color);
      
      System.out.print("Enter the horses birth year: ");
      year = keyboard.nextInt();
      aHorse.setHorseBirthYear(year);
      
      System.out.print("Enter number of races horse has completed: ");
      races = keyboard.nextInt();
      aRaceHorse.setNumberOfRaces(races);

      System.out.print("Enter horses place in last race completed: ");
      place = keyboard.nextInt();
      aRaceHorse.setPlaceInLastRace(place);
      
      // Displays user input values for horses name, color, birth year. and races completed
      aHorse.displayHorseInfo();
      
      System.out.println("Horses Name: " + aHorse.getHorseName());
      System.out.println("Horses Color: " + aHorse.getHorseColor());
      System.out.println("Horses Birth Year: " + aHorse.getHorseBirthYear());
      System.out.println(name + " has completed " + aRaceHorse.getNumberOfRaces() + " races");
      System.out.println(name + " placed number " + aRaceHorse.getPlaceInLastRace() + " in the last race completed");
   }
}