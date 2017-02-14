// Filename: JPasswordB.java
// Written by: William Bartel
// Written on: 12/14/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPasswordB extends JApplet implements ActionListener
{
   // Creating new JLabel object
   JLabel request = new JLabel("Please enter your password:");
   // Creating new black JLabel object to display message
   JLabel message = new JLabel(" ");
   // Creating new JTextField object for user entry
   JTextField entry = new JTextField(10);
   // Creating new JButton object
   JButton pressButton = new JButton("Press to Enter");
   Container con = getContentPane();
   
   // Applet method to add elements to content pane and ActionListener to JButton
   public void init()
   {
      con.add(request);
      con.add(entry);
      con.add(pressButton);
      con.add(message);
      con.setLayout(new FlowLayout());
      pressButton.addActionListener(this);
      entry.addActionListener(this);
   }
   
   // Method to verify user entry with list of passwords when button is clicked
   public void actionPerformed(ActionEvent e)
   {
      // Initializing string variable to store user entry
      String password = entry.getText();
      // If else statement to verify password and display access message
      if(password.equalsIgnoreCase("Rosebud"))
      {
         message.setText("Access Granted");
      }
      else
      {
         message.setText("Access Denied");
      }
      validate();
   }
}