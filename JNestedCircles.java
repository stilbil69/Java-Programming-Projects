// Filename: JNestedCircles.java
// Written by: William Bartel
// Written on: 12/10/16

import javax.swing.*;
import java.awt.*;

// Class definition
public class JNestedCircles extends JFrame
{
   final int NUM_OF_CIRCLES = 15;
   
   // Constructor for JNestedCircles method, set close operation
   public JNestedCircles()
   {
      super("JNestedCircles App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void paint(Graphics gr)
   {
      super.paint(gr);
      
      // Initializing variables
      int i = 0;
      int x = 0;
      int y = 0;
      int xCenter = 0;
      int yCenter = 0;
      int rad = 0;
      int diam = 0;
      
      // Setting x and y coordinate for center of the circles
      xCenter = getWidth() / 2;
      yCenter = getWidth() / 2;
      
      for(i = 0; i < NUM_OF_CIRCLES; i++)
      {
         // Starting radius of circle
         rad += 15;
         // Setting values for width and height of circle
         x = xCenter - rad;
         y = yCenter - rad;
         diam = rad * 2;
         // Drawing circles using drawOval() method
         gr.drawOval(x, y, diam, diam);
      }
   }
   // Main method that instantiates a new instance of JNestedCircles class
   // Sets JFrame size and visibility
   public static void main(String[] args)
   {
      JNestedCircles frame = new JNestedCircles();
      frame.setSize(550, 550);
      frame.setVisible(true);
   }
} 