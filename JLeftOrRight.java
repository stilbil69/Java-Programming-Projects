// Filename: JLeftOrRight.java
// Written by: William Bartel
// Written on: 11/23/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating class for JLeftOrRight application
public class JLeftOrRight extends JFrame implements MouseListener
{
   // Initializing variables for x and y position of location of mouse click
   private int x;
   private int y;
   
   // Creating a new instance of JLabel for instructions
   private JLabel label = new JLabel("Click the left, right, or center mouse button inside this window.");
   String msg = "";
   
   // Constructor for JLeftOrRight class
   public JLeftOrRight()
   {
      // Sets title and default close operation for JLeftOrRight app
      setTitle("JLeftOrRight App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Setting the layout as a FlowLayout
      setLayout(new FlowLayout());
      // Adds mouse listener to JFrame
      addMouseListener(this);
      // Adds JLabel to JFrame
      add(label);
   }
   // Constructor for mouse clicked event
   public void mouseClicked(MouseEvent e)
   {
      // Creating variable to determine which button has been clicked
      int whichButton = e.getButton();
      // Check to see if left mouse button has been clicked
      msg = "You have clicked the ";
      if(whichButton == MouseEvent.BUTTON1)
      {
         msg += "left mouse button ";
      }
      // Check to see if center mouse button has been clicked
      else
         if(whichButton == MouseEvent.BUTTON2)
         {
            msg += "center mouse button ";
         }
         // Checks if left or center mouse button hasn't been clicked, right mouse clicked
         else
            msg += "right mouse button ";
      msg += "at position " + e.getX() + ", " + e.getY() + ".";
      // Sets text label message
      label.setText(msg);
   }
   // Constructor for mouse entering JFrame window
   public void mouseEntered(MouseEvent e)
   {
   }
   // Constructor for mouse exiting JFrame window
   public void mouseExited(MouseEvent e)
   {
   }
   // Constructor for mouse pressed
   public void mousePressed(MouseEvent e)
   {
   }
   // Constructor for mouse released
   public void mouseReleased(MouseEvent e)
   {
   }
   // Main method for JLeftorRight class
   public static void main(String[] args)
   {
      // Creating new instance if JLeftOrRight class
      JLeftOrRight mFrame = new JLeftOrRight();
      // Setting width and height of JFrame and makeing JFrame visible
      final int WIDTH = 750;
      final int HEIGHT = 300;
      mFrame.setSize(WIDTH, HEIGHT);
      mFrame.setVisible(true);
   }
}