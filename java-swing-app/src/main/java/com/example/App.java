package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
      //add your code here!
      System.out.println("hello world");
      JFrame frame = new JFrame("Hello Swing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setSize(400,400);
      frame.setLayout(new FlowLayout());

      JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
      JButton okButton = new JButton("OK");
      JButton notOkButton = new JButton("Not OK");
      JButton bestButton = new JButton("Who is the Best?");    

      frame.add(label);
      frame.add(okButton);
      frame.add(notOkButton);
      frame.add(bestButton);
     // frame.pack();                
      frame.setLocationRelativeTo(null); 
      frame.setVisible(true);

      okButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("You did it!!!");
        }          
      });

      notOkButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          notOkButton.setText("I may be OK!");
        }          
      });

      bestButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          bestButton.setText("Mr. Brown is the Best!!!");
        }          
      });
      
    }
}