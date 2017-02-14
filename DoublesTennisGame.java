//Filename DoublesTennisGame.java
//Written by William Bartel
//Written on 10/01/2016

public class DoublesTennisGame extends TennisGame
{
   private String playerOnePartner;
   private String playerTwoPartner;

   // Getters for doubles players partner names
   public String getPlayerOnePartner()
   {
      return playerOnePartner;
   }
   
   public String getPlayerTwoPartner()
   {
      return playerTwoPartner;
   }

   // Setter for players and parnters names
   public void setNames(String name1, String nameOnePartner, String name2, String nameTwoPartner)
   {
      playerOneName = name1;
      playerTwoName = name2;
      playerOnePartner = nameOnePartner;
      playerTwoPartner = nameTwoPartner;
   }

   // Method to display tennis game results
   public void display()
   {
      System.out.println(getPlayerOneName() + " and " + getPlayerOnePartner() + " vs. " + getPlayerTwoName() + " and " + getPlayerTwoPartner() + " - Final Score (" + getPlayerOneScore() + " - " + getPlayerTwoScore() + "): " + getPlayerOneStringScore() + " / " + getPlayerTwoStringScore());
   }
}