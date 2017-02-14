// Filename: JColorFrame.java
// Written by: William Bartel
// Written on: 11/09/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating class for JColorFrame application
public class JColorFrame extends JFrame implements ActionListener
{
   private JButton nb = new JButton(" ");
   private JButton sb = new JButton(" ");
   private JButton eb = new JButton(" ");
   private JButton wb = new JButton(" ");
   private JButton cb = new JButton("Click me");
   
   public JColorFrame()
   {
      super("JColorFrame App");
      setLayout(new BorderLayout());
      add(nb, BorderLayout.NORTH);
      add(sb, BorderLayout.SOUTH);
      add(eb, BorderLayout.EAST);
      add(wb, BorderLayout.WEST);
      add(cb, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Disabling all buttons excluding the center button
      nb.setEnabled(false);
      sb.setEnabled(false);
      eb.setEnabled(false);
      wb.setEnabled(false);
      // Adding ActionListener to center button
      cb.addActionListener(this);
      
      // Setting starting background color for each region except for center button
      nb.setBackground(Color.RED);
      sb.setBackground(Color.GREEN);
      eb.setBackground(Color.BLUE);
      wb.setBackground(Color.YELLOW);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      int direction;
      // Generates a random number to change background colors each time center button is clicked
      direction = (int)(Math.random() * 4) + 1;

      if(direction == 1)
      {
         nb.setBackground(Color.YELLOW);
         sb.setBackground(Color.RED);
         eb.setBackground(Color.GREEN);
         wb.setBackground(Color.BLUE);            
      }
      else if(direction == 2)
      {
         nb.setBackground(Color.BLUE);
         sb.setBackground(Color.YELLOW);
         eb.setBackground(Color.RED);
         wb.setBackground(Color.GREEN);
      }
      else if(direction == 3)
      {
         nb.setBackground(Color.GREEN);
         sb.setBackground(Color.BLUE);
         eb.setBackground(Color.YELLOW);
         wb.setBackground(Color.RED);
      }
      else 
      {
         nb.setBackground(Color.RED);
         sb.setBackground(Color.GREEN);
         eb.setBackground(Color.BLUE);
         wb.setBackground(Color.YELLOW);
      }
   }
   
   public static void main(String[] args)
   {
      JColorFrame jcf = new JColorFrame();
      jcf.setSize(250, 250);
      jcf.setVisible(true);
   }
}