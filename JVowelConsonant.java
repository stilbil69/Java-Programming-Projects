// Filename: JVowelConsonant.java
// Written by: William Bartel
// Written on: 11/09/16

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating class for JVowelConsonant application
public class JVowelConsonant extends JFrame implements ActionListener
{
   int counter;
   int selection;
   // Instantiating 26 JButtons, 1 for each letter of the alphabet
   private JButton ab = new JButton("a");
   private JButton bb = new JButton("b");
   private JButton cb = new JButton("c");
   private JButton db = new JButton("d");
   private JButton eb = new JButton("e");
   private JButton fb = new JButton("f");
   private JButton gb = new JButton("g");
   private JButton hb = new JButton("h");
   private JButton ib = new JButton("i");
   private JButton jb = new JButton("j");
   private JButton kb = new JButton("k");
   private JButton lb = new JButton("l");
   private JButton mb = new JButton("m");
   private JButton nb = new JButton("n");
   private JButton ob = new JButton("o");
   private JButton pb = new JButton("p");
   private JButton qb = new JButton("q");
   private JButton rb = new JButton("r");
   private JButton sb = new JButton("s");
   private JButton tb = new JButton("t");
   private JButton ub = new JButton("u");
   private JButton vb = new JButton("v");
   private JButton wb = new JButton("w");
   private JButton xb = new JButton("x");
   private JButton yb = new JButton("y");
   private JButton zb = new JButton("z");
   
   // Creating an array for letters to be selected randomly from
   private JButton letters[] = {ab,bb,cb,db,eb,fb,gb,hb,ib,jb,kb,lb,mb,nb,ob,pb,qb,rb,sb,tb,ub,vb,wb,xb,yb,zb};
   
   // Creating an array of randomly generated numbers
   int[] randomArray = new Random().ints(0, 26).distinct().limit(26).toArray();
   
   // Instantiating 3 JPanel's
   private JPanel panel1 = new JPanel();
   private JPanel panel2 = new JPanel();
   private JPanel panel3 = new JPanel();
   
   // Instantiating a JLabel for user instruction
   private JLabel vowelConsonant = new JLabel("Click on a letter to see if it's a vowel or consonant...", SwingConstants.CENTER);
   
   // Constructor to set JFrame to a grid layout and adds JButtons
   public JVowelConsonant()
   {
      super("JVowelConsonant App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container con = getContentPane();
      con.setLayout(new GridLayout(2, 2, 2, 2));
      
      // Layout for panel 1
      con.add(panel1);
      
      // For loop to add 4 letters to panel 1
      for(counter = 0; counter < 4; counter++)
      {
         selection = randomArray[counter];
         panel1.add(letters[selection]);
      }
      
      // Layout for panel 2
      con.add(panel2);
      
      // For loop to add next 4 letters to panel 2
      for(counter = 4; counter < 8; counter++)
      {
         selection = randomArray[counter];
         panel2.add(letters[selection]);     
      }
      
      // Layout for panel 3
      con.add(panel3);
      panel3.add(vowelConsonant);
      setSize(600, 125);
      
      // For loop to set up ActionListener to 26 JButtons for each letter
      int actionCounter;
      for(actionCounter = 0; actionCounter < letters.length; actionCounter++)
      {
         letters[actionCounter].addActionListener(this);
      }
   }
   
   public void actionPerformed(ActionEvent a)
   {
      Object choice = a.getSource();
      
      // Determine if choice (button clicked) is a vowel, if not, sets text to "consonant"
      if((choice == ab) || (choice == eb) || (choice == ib) || (choice == ob) || (choice == ub))
      {
         vowelConsonant.setText("The letter you clicked is a vowel"); 
      }
      else
      {
         vowelConsonant.setText("The letter you clicked is a consonant");
      }
      
      // Hides the button that was cliked
      JButton buttonClicked = (JButton)choice;
      buttonClicked.setVisible(false);
      
      // Try Catch to find the next number and add to the location the button was clicked
      try
      {
         selection = randomArray[counter];
         Object panelNumber = buttonClicked.getParent();
         if(panelNumber == panel1)
         {
            panel1.add(letters[selection]);
         }
         else if(panelNumber == panel2)
         {
            panel2.add(letters[selection]);
         }
         counter++;
      }
      // Error catching: if counter value is greater than 25
      catch(ArrayIndexOutOfBoundsException oob)
      {
         // Initializing counter variable
         counter = 0;
         // Instantiates a new JVowelConsonant object to continue game
         JVowelConsonant jvc = new JVowelConsonant();
         jvc.setVisible(true);
      }
   }
   
   // main() method that instantiates JVowelConsonannt app and sets size & visibility
   public static void main(String[] args)
   {
      JVowelConsonant jvc = new JVowelConsonant();
      jvc.setVisible(true);
   }
}
