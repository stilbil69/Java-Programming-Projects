// Filename: JLandmarkFrame.java
// Written by: William Bartel
// Written on: 11/09/16

import javax.swing.*;
import java.awt.*;

// Creating class for JLandmarkFrame application
public class JLandmarkFrame extends JFrame
{
   // Instantiating 5 JButtons with landmark names for BorderLayout
   private JButton nb = new JButton("Statue of Liberty");
   private JButton sb = new JButton("Washington Monument");
   private JButton eb = new JButton("Lincoln Monument");
   private JButton wb = new JButton("Mount Rushmore");
   private JButton cb = new JButton("Grand Canyon");
   
   // Constructor to set JFrame layout and adds 5 JButtons
   public JLandmarkFrame()
   {
      setLayout(new BorderLayout());
      add(nb, BorderLayout.NORTH);
      add(sb, BorderLayout.SOUTH);
      add(eb, BorderLayout.EAST);
      add(wb, BorderLayout.WEST);
      add(cb, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   // main() method that instantiates JBorderLayout and sets size & visibility
   public static void main(String[] args)
   {
      JLandmarkFrame jlf = new JLandmarkFrame();
      jlf.setSize(400, 125);
      jlf.setVisible(true);
   }
}
