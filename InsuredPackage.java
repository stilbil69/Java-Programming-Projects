//Filename InsuredPackage.java
//Written by William Bartel
//Written on 09/30/2016

public class InsuredPackage extends Package
{
   public InsuredPackage(int weight, char method)
   {
      super(weight, method);
      
      if(cost >= 0 && cost <= 1.00)
      {
         cost = cost + 2.45;
      }
      else if(cost >= 1.01 && cost <= 3.00)
      {
         cost = cost + 3.95;
      }
      else if(cost >= 3.01)
      {
         cost = cost + 5.55;
      }
   }
}