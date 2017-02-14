//Filename Life.java
//Written by William Bartel
//Written on 10/08/2016

public class Life extends Insurance
{
   public Life()
   {      
      super("Life");
      setCost(36.00);
   }

   public void display()
   {
      System.out.println("You have selected " + insType + " insurance at a cost of $" + cost + " per month");
   }

   public void setCost(double cost)
   {
      this.cost = cost;
   }
}