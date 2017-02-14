// Filename FileStatistics2.java
// Written by William Bartel
// Written on 10/23/2016

import java.io.*;

public class FileStatistics2
{
   public static void main(String[] args)
   {
      //Instantiating a new file object for Quote.txt
      File myFile1 = new File("Quote.txt");
      
      //Instantiating a new file object for Quote.txt
      File myFile2 = new File("Quote.docx");  
      
      long file1Size = myFile1.length();
      long file2Size = myFile2.length();
      long fileRatio = file2Size / file1Size; 
      
      // Displaying file size of Quote.txt and Quote.docx and the size ratio of the .docx file over the .txt file 
      System.out.println(myFile1.getName() + " is " + file1Size + " bytes");
      System.out.println(myFile2.getName() + " is " + file2Size + " bytes");
      System.out.println("The .docx file is " + fileRatio + " times larger than the .txt file");
   }
}