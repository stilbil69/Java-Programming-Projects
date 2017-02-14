//Filename TennisGame.java
//Written by William Bartel
//Written on 10/01/2016


public class TennisGame
{
   protected String playerOneName;
   protected String playerTwoName;
   private int playerOneScore;
   private int playerTwoScore;
   private String playerOneStringScore;
   private String playerTwoStringScore;

   // Getters for both players names, scores, and scores as a string
   public String getPlayerOneName()
   {
      return playerOneName;
   }
   
   public String getPlayerTwoName()
   {
      return playerTwoName;
   }
   
   public int getPlayerOneScore()
   {
      return playerOneScore;
   }
   
   public int getPlayerTwoScore()
   {
      return playerTwoScore;
   }
   
   public String getPlayerOneStringScore()
   {
      return playerOneStringScore;
   }
   
   public String getPlayerTwoStringScore()
   {
      return playerTwoStringScore;
   }

   // Setters for both players names
   public void setNames(String name1, String name2)
   {
      playerOneName = name1;
      playerTwoName = name2;
   }

   // Setting players scores and calculating thier final scores
   public void setScores(int score1, int score2)
   {
      if(score1 < 0 || score1 > 4 || score2 < 0 || score2 > 4 || (score1 == 4 && score2 == 4))
      { 
         score1 = 0;
         score2 = 0;
         playerOneStringScore = "error";
         playerTwoStringScore = "error";
      }
      else
      {
         playerOneStringScore = formatScore(score1);
         playerTwoStringScore = formatScore(score2);
      }
      playerOneScore = score1;
      playerTwoScore = score2;
    }

   // Method to return traditional names for scores
   private String formatScore(int score)
   {
      String traditionalScore = "";
      switch (score)
      {
         case 0:
         traditionalScore = "love";
         break;
         
         case 1:
         traditionalScore = "15";
         break;
         
         case 2:
         traditionalScore = "30";
         break;
         
         case 3:
         traditionalScore = "40";
         break;
         
         case 4:
         traditionalScore = "game";
         break;
      }
      return traditionalScore;
   }

   // Display method for results of tennis game
   public void display()
   {
      System.out.println(getPlayerOneName() + " vs. " + getPlayerTwoName() + " - Final Score (" + getPlayerOneScore() + " - " + getPlayerTwoScore() + "): " + getPlayerOneStringScore() + " / " + getPlayerTwoStringScore());
   }
}