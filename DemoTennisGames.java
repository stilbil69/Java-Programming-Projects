//Filename DemoTennisGame.java
//Written by William Bartel
//Written on 10/01/2016

public class DemoTennisGames
{
   public static void main(String args[])
   {
      // Setting variables for player names and scores
      // to test different tennis game outcomes
      TennisGame game1 = new TennisGame();
      game1.setNames("Becker", "McEnroe");
      game1.setScores(2, 1);
      game1.display();

      TennisGame game2 = new TennisGame();
      game2.setNames("Sharapova", "Golovin");
      game2.setScores(5, 3);
      game2.display();

      TennisGame game3 = new TennisGame();
      game1.setNames("Agassi", "Ashe");
      game1.setScores(0, 4);
      game1.display();
      
      DoublesTennisGame doublesGame1 = new DoublesTennisGame();
      doublesGame1.setNames("Becker", "McEnroe", "Agassi", "Ashe");
      doublesGame1.setScores(0, 1);
      doublesGame1.display();

      DoublesTennisGame doublesGame2 = new DoublesTennisGame();
      doublesGame2.setNames("Sharapova", "Golovin", "King", "Williams");
      doublesGame2.setScores(4, 3);
      doublesGame2.display();

      DoublesTennisGame doublesGame3 = new DoublesTennisGame();
      doublesGame3.setNames("Becker", "Agassi", "Sharapova", "Williams");
      doublesGame3.setScores(-1, 2);
      doublesGame3.display();
   }
}