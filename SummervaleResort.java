// Filename: SummervaleResort.java
// Written by: William Bartel
// Written on: 11/25/16

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Creating class for SummervaleResort application
public class SummervaleResort extends JFrame implements ActionListener
{
   // Creating menu bar for JFrame
   private JMenuBar mainBar = new JMenuBar();
   // Creating welcome message that displays when app is started
   private JLabel welcome = new JLabel("Make a selection from the menus above to see details...");
   // Creating room type menu and setting menu items and info
   private JMenu roomMenu = new JMenu("Room Types");
   private JMenuItem standardRoom = new JMenuItem("Standard");
   private JLabel standardInfo = new JLabel("The resorts Standard rooms have a queen size bed with a view of the pool.");
   private JMenuItem deluxeRoom = new JMenuItem("Deluxe");
   private JLabel deluxeInfo = new JLabel("The resorts Deluxe rooms have a king size bed with a spectacluar ocean view.");
   // Creating dining type menu and setting menu items and info
   private JMenu diningMenu = new JMenu("Dining");
   private JMenuItem buffetDining = new JMenuItem("Buffet");
   private JLabel buffetInfo = new JLabel("The resorts world class buffet is open nightly from 5pm to 9pm.");
   private JMenuItem fineDining = new JMenuItem("Fine Dining");
   private JLabel diningInfo = new JLabel("Enjoy the resorts award winning restaurant for breakfast, lunch, and dinner. Open 24 hours a day.");
   // Creating activities menu and setting menu items and info
   private JMenu activityMenu = new JMenu("Activities");
   private JMenuItem hiking = new JMenuItem("Hiking Trails");
   private JLabel hikingInfo = new JLabel("The resort has over 20 miles of scenic walking trails.");
   private JMenuItem horses = new JMenuItem("Horseback Riding");
   private JLabel horsesInfo = new JLabel("Enjoy a ride around the resort's 300 acres on horseback.");
   // Creating new JPanel
   private JPanel window = new JPanel();

   // Constructor for SummervaleResort class
   public SummervaleResort()
   {
      // Setting app title and close operation
      setTitle("Summervale Resort Info App");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Setting layout to FlowLayout
      setLayout(new FlowLayout());
      // Adding menu bar
      setJMenuBar(mainBar);
      // Adding room type menu to menu bar and adding items to menu
      mainBar.add(roomMenu);
      roomMenu.add(standardRoom);
      roomMenu.add(deluxeRoom);
      // Adding dining type menu to menu bar and adding items to menu      
      mainBar.add(diningMenu);
      diningMenu.add(buffetDining);
      diningMenu.add(fineDining);
      // Adding activity type menu to menu bar and adding items to menu     
      mainBar.add(activityMenu);
      activityMenu.add(hiking);
      activityMenu.add(horses);
      // Calling addActionListeners method      
      addActionListeners();
      // Adding Jpanel and welcome message to JPanel
      add(window);
      window.add(welcome);
   }
   // Method to add action listener to each menu item
   public void addActionListeners()
   {
      standardRoom.addActionListener(this);
      deluxeRoom.addActionListener(this);
      buffetDining.addActionListener(this);
      fineDining.addActionListener(this);
      hiking.addActionListener(this);
      horses.addActionListener(this);
   }
   // Action performed method to get info for menu item selected
   public void actionPerformed(ActionEvent e)
   {
      String info = "";
      Object source = e.getSource();
      if(source == standardRoom)
      {
         info = standardInfo.getText();
         welcome.setText(info);
      }
      else if(source == deluxeRoom)
      {
         info = deluxeInfo.getText();
         welcome.setText(info);
      }
      else if(source == buffetDining)
      {
         info = buffetInfo.getText();
         welcome.setText(info);
      }
      else if(source == fineDining)
      {
         info = diningInfo.getText();
         welcome.setText(info);
      }
      else if(source == hiking)
      {
         info = hikingInfo.getText();
         welcome.setText(info);
      }
      else
         info = horsesInfo.getText();
         welcome.setText(info);
   }
   // Main method that creates new instance of the SummervaleResort class
   public static void main(String[] args)
   {
      SummervaleResort frame = new SummervaleResort();
      final int WIDTH = 600;
      final int HEIGHT = 200;
      frame.setSize(WIDTH, HEIGHT);
      frame.setVisible(true);
   }
}