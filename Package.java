//Filename Package.java
//Written by William Bartel
//Written on 09/30/2016

public class Package
{
   // Creating variables for package weight, shipping method, and shipping cost
   int weight;
   char method;
   double cost;
   
   // Constructor to initialize variables for weight & shipping method
   // Calling method to calculate shipping cost
   public Package(int weight, char method)
   {
      super();
      this.weight = weight;
      this.method = method;
      calculateCost();
   }
   
   // Method to calculate total shipping cost
   private void calculateCost()
   {
      if(weight >= 1 && weight <= 8)
      {
         if(method == 'A' || method == 'a')
         {
            cost = 2.00;
         }
         else if(method == 'T' || method == 't')
         {
            cost = 1.50;
         }
         else if(method == 'M' || method == 'm')
         {
            cost = 0.50;
         }
      }
      else if(weight >= 9 && weight <= 16)
      {
         if(method == 'A' || method == 'a')
         {
            cost = 3.00;
         }
         else if(method == 'T' || method == 't')
         {
            cost = 2.35;
         }
         else if(method == 'M' || method == 'm')
         {
            cost = 1.50;
         }
      }
      else if(weight >= 17)
      {
         if(method == 'A' || method == 'a')
         {
            cost = 4.50;
         }
         else if(method == 'T' || method == 't')
         {
            cost = 3.25;
         }
         else if(method == 'M' || method == 'm')
         {
            cost = 2.15;
         }
      }
   }
   
   // Method to display total shipping cost   
   public void display()
   {
      System.out.println("Weight: " + weight + " oz." + "  Shipping Method: " + method);    
      System.out.println("Total shipping cost is: $" + cost);
      System.out.println();
   }
}