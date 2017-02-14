//Filename RaceHorse.java
//Written by William Bartel
//Written on 09/28/2016

public class RaceHorse extends Horse
{
   // Initializing variables for horses races completed
   // and its place in last race completed
   private int numberOfRaces;
   private int placeInLastRace;

   // Getters & setters for horses number of races completed
   // and place in last race completed 
   public int getNumberOfRaces()
   {
      return numberOfRaces;
   }
   
   public void setNumberOfRaces(int races)
   {
      numberOfRaces = races;
   }
   
   public int getPlaceInLastRace()
   {
      return placeInLastRace;
   }
   
   public void setPlaceInLastRace(int place)
   {
      placeInLastRace = place;
   }
}