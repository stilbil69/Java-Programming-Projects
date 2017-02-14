//Filename ProductException.java
//Written by William Bartel
//Written on 10/15/2016

import java.util.*;

public class ProductException extends Exception
{
   // Constructor that receives a string argument for product info as product number & price
   public ProductException(String prodInfo)
   {
      // Displays error message if product object is not created successfully
      System.out.println("Product object was not created successfully");
   }
}