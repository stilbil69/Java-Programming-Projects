// Filename: JMovingFrame.java
// Written by: William Bartel
// Written on: 11/20/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating class for JMovingFrame application
public class JMovingFrame extends JFrame implements ActionListener
{
   // Initializing variable to track the number of times the button is clicked
   int clickCount;
   
   // Creating 3 - JPanels, 1 - JButton, and 1 - JLable
   private JButton button = new JButton("Click to move label");
   private JPanel panel1 = new JPanel();
   private JPanel panel2 = new JPanel();
   private JPanel panel3 = new JPanel();
   private JLabel label = new JLabel("I'm over here now");
   
   // Creating BorderLayout for JFrame
   private BorderLayout layout = new BorderLayout();
   
   // Constructor for JMovingFrame class
   public JMovingFrame()
   {
      // Setting title for JFrame
      super("JMovingFrame App");
      // Initialzing clickCount variable to 0
      clickCount = 0;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Sets layout to BorderLayout as defined in the JMovingFrame class
      setLayout(layout);
      // Adds label to panel 1 and panel 2
      panel1.add(label);
      panel2.add(label);
      // Adds button to panel 3
      panel3.add(button);
      // Setting position of panels 1, 2  and 3 in BorderLayout
      add(panel1, layout.EAST);
      add(panel2, layout.WEST);
      add(panel3, layout.SOUTH);
      // Adding ActionListener to button
      button.addActionListener(this);
   }
   // Method to define ActionEvent
   public void actionPerformed(ActionEvent event)
   {
      // If else statement to check clickCount and move label
      if(clickCount % 2 == 1)
      {
         panel1.setVisible(false);
         panel2.setVisible(true);
         panel2.add(label);
         clickCount++;
      }
      else
      {
         panel1.setVisible(true);
         panel2.setVisible(false);
         panel1.add(label);
         clickCount++;
      }
   }
   // Main method for JMovingFrame class
   public static void main(String[] args)
   {
      // Creating new JMovingFrame class object
      JMovingFrame jmf = new JMovingFrame();
      jmf.setVisible(true);
      jmf.setSize(400, 150);
   }
}