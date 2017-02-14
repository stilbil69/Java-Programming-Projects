//Filename FileStatistics.java
//Written by William Bartel
//Written on 10/23/2016

import java.io.*;

public class FileStatistics
{
   public static void main(String[] args)
   {
      //Instantiating a new file object
      File myFile = new File("Exercise1.txt");
      
      // Displaying file name, size, and time of last modification
      System.out.println("File name is: " + myFile.getName());
      System.out.println("File size is (bytes): " + myFile.length());
      System.out.println("File was last modified at: " + myFile.lastModified());
   }
}