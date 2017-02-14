// Filename: JSmileFace.java
// Written by: William Bartel
// Written on: 12/11/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.*;

// Class definition
public class JSmileFace extends JFrame
{
   // Constructor for JSmileFace method
   public JSmileFace()
   {
      setTitle("JSmileFace App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void paint(Graphics gr)
   {
      super.paint(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      // Creates circle with yellow fill color
      Ellipse2D.Float ellipse = new Ellipse2D.Float(20F, 40F, 80F, 80F);
      gr2D.setColor(Color.YELLOW);
      gr2D.fill(ellipse);
      
      // Creates smile with drawArc() method
      gr.setColor(Color.BLACK);
      gr.drawArc(30, 50, 60, 60, 200, 145);
      
      //Creates left eye with black fill color
      Ellipse2D.Float eyeLeft = new Ellipse2D.Float(40F, 65F, 10F, 10F);
      gr2D.setColor(Color.BLACK);
      gr2D.fill(eyeLeft);
      
      //Creates right eye with black fill color
      Ellipse2D.Float eyeRight = new Ellipse2D.Float(70F, 65F, 10F, 10F);
      gr2D.setColor(Color.BLACK);
      gr2D.fill(eyeRight);
   }
   // Main method instantiates new instance of JSmileFace() class, sets size and visibility
   public static void main(String[] args)
   {
      JSmileFace frame = new JSmileFace();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}