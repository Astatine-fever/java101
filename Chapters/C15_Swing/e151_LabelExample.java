package Chapters.C15_Swing;

import javax.swing.*; 
public class e151_LabelExample { 
public static void main(String[] args) { 
JFrame frame = new JFrame("Label Example"); 
JLabel label = new JLabel("Hello, World!"); frame.add(label); frame.setSize(300, 200); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true); 
} 
}