//Filename ThrowProductException.java
//Written by William Bartel
//Written on 10/15/2016

import java.util.*;

public class ThrowProductException
{
   public static void main(String[] args) throws ProductException
   {
      // Try blocks create a new instance of Product
      // Catch blocks throw exception
      try
      {
         Product p1 = new Product(111, 11);
      }
      catch(ProductException e)
      {
      }
      
      try
      {
         Product p2 = new Product(22, 22);
      }
      catch(ProductException e)
      {
      }
      
      try
      {
         Product p3 = new Product(333, 33);
      }
      catch(ProductException e)
      {
      }
      
      try
      {
         Product p4 = new Product(444, 44444);
      }
      catch(ProductException e)
      {
      }
   }
   
}