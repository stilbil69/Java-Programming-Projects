// Filename JPopulation.java
// Written by William Bartel
// Written on 11/03/2016

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPopulation extends JFrame implements ActionListener
{   

   String pop;
   String[] countryNames = {"Select a country", "Germany", "Australia", "Sweden", "Russia", "Turkey", "Spain", "Latvia"};
   JLabel instruction = new JLabel("Select a country to show its population");
   JComboBox population = new JComboBox(countryNames);
   JTextField countryPop = new JTextField(25);

   public JPopulation()
   {
      super("JPopulation: Find countries population");
      setSize(450, 120);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(instruction);
      add(population);
      population.addActionListener(this);
      add(countryPop);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent a)
   {
      int country = population.getSelectedIndex();
      
      switch(country)
      {
         case 0:
            pop = "";
            break;
         case 1:
            pop = "81.41 million (2015)";
            break;
         case 2:
            pop = "23.78 million (2015)";
            break;
         case 3:
            pop = "9.80 million (2015)";
            break;
         case 4:
            pop = "144.10 million (2015)";
            break;
         case 5:
            pop = "78.67 million (2015)";
            break;
         case 6:
            pop = "46.42 million (2015)";
            break;
         case 7:
            pop = "1.98 million (2015)";
            break;
      }
      countryPop.setText(pop);
   }
   
   public static void main(String[] args)
   {
      JPopulation window = new JPopulation();
   }
}