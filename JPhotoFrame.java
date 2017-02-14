// Filename JPhotoFrame.java
// Written by William Bartel
// Written on 11/05/2016

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPhotoFrame extends JFrame implements ItemListener
{
   final int BASE_PRICE = 40;
   final int IN_STUDIO_FEE = 75;
   final int PET_FEE = 95;
   final int ON_LOCATION_FEE = 90;
   int totalPrice = BASE_PRICE;
   
   JCheckBox inStudioBox = new JCheckBox("In-studio session $" + IN_STUDIO_FEE, false);
   JCheckBox petBox = new JCheckBox("Pet photo session $" + PET_FEE, false);
   JCheckBox onLocationBox = new JCheckBox("On-location session $" + ON_LOCATION_FEE, false);
   
   JLabel sessionLabel = new JLabel("Paula's Portraits Photo Session Calculator");
   JLabel ePrice = new JLabel("The price for your photo session is");
   JTextField totPrice = new JTextField(4);
   JLabel optionExplainLabel = new JLabel("Base price for 1 person photo session is $" + BASE_PRICE + ".");
   JLabel optionExplainLabel2 = new JLabel("Choose from these options...");
   
   public JPhotoFrame()
   {
      super("Photo Session Price Estimator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(sessionLabel);
      add(optionExplainLabel);
      add(optionExplainLabel2);
      add(inStudioBox);
      add(petBox);
      add(onLocationBox);
      add(totPrice);
      
      totPrice.setText("$" + totalPrice);
      inStudioBox.addItemListener(this);
      petBox.addItemListener(this);
      onLocationBox.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent event)
   {
      Object source = event.getSource();
      int select = event.getStateChange();
      
      if(source == inStudioBox)
         if(select == ItemEvent.SELECTED)
            totalPrice += IN_STUDIO_FEE;
         else
            totalPrice -= IN_STUDIO_FEE;
      else if(source == inStudioBox)
      {
         if(select == ItemEvent.SELECTED)
            totalPrice += PET_FEE;
         else
            totalPrice -= PET_FEE;
      }
      else     // if(source == onLocationBox) by default
         if(select == ItemEvent.SELECTED)
            totalPrice += ON_LOCATION_FEE;
         else
            totalPrice -= ON_LOCATION_FEE;
         totPrice.setText("$" + totalPrice);
   }
   
   public static void main(String[] args)
   {
      JPhotoFrame aFrame = new JPhotoFrame();
      final int WIDTH = 300;
      final int HEIGHT = 200;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}