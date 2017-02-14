// Filename: JFontSizes.java
// Written by: William Bartel
// Written on: 12/09/16

import javax.swing.*;
import java.awt.*;

// Class definition
public class JFontSizes extends JFrame
{  
   // Initializing variables for string size
   int x, y;
   
   // Constructor to set string size, app title, and close operation
   public JFontSizes()
   {
      x = 25;
      y = 55;
      setTitle("JFontSizes App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   // paint() method to call super() method, uses graphics object to draw phrase at incremental sizes
   public void paint(Graphics gr)
   {
      super.paint(gr);
      // For loop to print phrase at each font size from 6 to 20
      for(int i = 6; i <= 20; i++)
      {
         Font font = new Font("Serif", Font.PLAIN, i);
         String phrase = "To be or not to be, that is the question.";
         gr.setFont(font);
         gr.drawString(phrase, x, y);
         // Sets minimum height for each phrase that is drawn
         y += 25;
      }
   }
   // Main method that instantiates new JFontSizes object, sets size of JFrame and visibility
   public static void main(String[] args)
   {
      JFontSizes frame = new JFontSizes();
      frame.setSize(350, 450);
      frame.setVisible(true);
   }
}