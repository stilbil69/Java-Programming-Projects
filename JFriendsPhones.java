// Filename: JFriendsPhones.java
// Written by: William Bartel
// Written on: 12/16/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFriendsPhones extends JApplet implements ActionListener
{
   // Creating new JLabel, JTextfield, and JButton objects
   JLabel displayMsg = new JLabel("Enter name or phone number:");
   JTextField entryField = new JTextField("", 10);
   JButton pressButton = new JButton("Click to Search");
   JLabel outputMsg = new JLabel();
   
   // Creating parallel arrays for friends names and phone numbers
   String[] names = {"tracey", "geoff", "mark", "karin", "steve"};
   int[] numbers = {2063254896, 2064687985, 2062346894, 2063538461, 2063681245};
   
   // 
   public void init()
   {
      // Setting size of pane, 
      setSize(350, 100);
      setLayout(new FlowLayout());
      add(displayMsg);
      add(entryField);
      add(pressButton);
      pressButton.addActionListener(this);
      add(outputMsg);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      int i = 0;
      // Creating variable to store user entry and converts to lowercase
      String entry = entryField.getText().toLowerCase();
      // Removing formatting from phone number is user enters (, ), -, or a space
      for(i = 0; i < entry.length(); i++)
      {
         if(entry.substring(i, i + 1).equals("(") || entry.substring(i, i + 1).equals(")") ||
            entry.substring(i, i + 1).equals("-") || entry.substring(i, i + 1).equals(" "))
         {
            entry = entry.substring(0, i) + entry.substring(i + 1);
         }
      }
      // Try to parse user entry as a phone number
      try
      {
         int number = Integer.parseInt(entry);
         for(i = 0; i < 5; i++)
         {
            if(number == numbers[i])
            {
               String name = names[i];
               name = name.substring(0, 1).toUpperCase() + name.substring(1);
               outputMsg.setText(name);
            }
         }
      }
      // Catch error if a name is input rather than a phone number
      catch(NumberFormatException error)
      {
         for(i = 0; i < 5; i++)
         {
            if(entry.equals(names[i]))
            {
               String number = "" + numbers[i];
               
               outputMsg.setText(number);
            }
         }
      }
   }
}