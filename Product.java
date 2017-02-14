//Filename Product.java
//Written by William Bartel
//Written on 10/15/2016

import java.util.*;

public class Product
{
   // Declaring fields for product number and product price
   private int prodNum;
   private double price;
   
   // Constructor that requires values for product number and price fields
   public Product(int num, double p) throws ProductException
   {
      String prodInfo = Integer.toString(num);
      
      // Test for 3 digit product number and throws exception if not 3 digits
      if(prodInfo.length() != 3) throw new ProductException(prodInfo + Double.toString(p));
      prodNum = num;
      // Test for correct price range and throws exception if out of range
      if(p < 0.01 || p > 1000)
         throw new ProductException(prodInfo + Double.toString(p));
         price = p;
      // Display if object was created successfully
      System.out.println("Product object was created successfully");
   }
}