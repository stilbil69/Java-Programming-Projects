// Filename JDisappearingFriends.java
// Written by William Bartel
// Written on 11/01/2016

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class JDisappearingFriends extends JFrame implements ActionListener
{
   // Declaring 5 name objects and labeling them
   JLabel name1 = new JLabel("Bill");
   JLabel name2 = new JLabel("Chris");
   JLabel name3 = new JLabel("James");
   JLabel name4 = new JLabel("Jed");
   JLabel name5 = new JLabel("Jason");
   
   // Declaring a button to remove name from list
   JButton button = new JButton("Remove name");
   
   // Declaring a JLabel array with 5 names
   JLabel[] names = {name1, name2, name3, name4, name5};
  
   // Declaring a string array of 5 names
   String[] newNames = {"Steve", "Nick", "Mark", "Phil", "Geoff"};
  
   // Constructor for random object
   Random random = new Random();

   // JDisappearingFriends class constructor
   public JDisappearingFriends()
   {
      super("Disappearing Friends");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      // For loop to remove and replace names from first postion to fifth
      for(int i = 0; i < 5; i++)
         add(names[i]);
      
      // Adds new button and listens for click  
      add(button);
      button.addActionListener(this);
   }

   // Method to remove and replace names in array
   public void actionPerformed(ActionEvent e)
   {
      int nameIndex = random.nextInt(5);
      int newIndex = random.nextInt(5);
      
      String oldName = names[nameIndex].getText();
      String newName = newNames[newIndex];
  
      names[nameIndex].setText(newName);
      newNames[newIndex] = oldName;
   }

   // Main method to create new instance of JDisappearingFriends class
   // Sets frame size and visibility
   public static void main(String[] args)
   {
      JDisappearingFriends frame = new JDisappearingFriends();
      frame.setSize(400, 100);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}