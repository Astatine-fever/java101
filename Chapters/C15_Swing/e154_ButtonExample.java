package Chapters.C15_Swing;

import javax.swing.*; 
public class e154_ButtonExample { 
public static void main(String[] args) { 
JFrame frame = new JFrame("Button Example"); 
JButton button = new JButton("Click Me"); 
frame.add(button); 
frame.setSize(300, 200); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setVisible(true); 
} 
}