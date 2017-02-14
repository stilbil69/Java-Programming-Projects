// Filename DisplayBook.java
// Written by William Bartel
// Written on 10/23/2016

import java.io.*;
import java.util.*;

public class DisplayBook
{
   public static void main(String[] args)
   {
      try
      {
         // Instantiating a new file object called BookName.txt
         File myFile = new File("BookName.txt");	
            
         //Opening BookName.txt file
         FileInputStream in = new FileInputStream(myFile);
         	
         // Reading each letter in the input stream and displaying them
	      int letter;
         while ((letter = in.read()) != -1)
         {
            System.out.print((char)letter);
         }
         // Closing file
         in.close();
      }
      catch (IOException exc)
      {
         // Displaying error message if BookName.txt file does not exist
         System.out.println("Your favorite book name does not exist...");
         try
         {
            File myFile = new File("BookName.txt");
            FileOutputStream out = new FileOutputStream(myFile);
            // User prompt to enter favorite book name
            System.out.print("Enter the name of your favorite book: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            // Writing name of favorite book to file
            for(int x = 0; x < name.length(); ++x)
               out.write(name.charAt(x));
            // Closing file
            out.close();
         }
         catch(IOException exc2)
         {
            System.out.println(exc2.getMessage());
         }
      }
   }
}