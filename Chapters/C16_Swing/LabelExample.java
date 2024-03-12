package Chapters.C16_Swing;

import javax.swing.*; 
public class LabelExample { 
public static void main(String[] args) { 
JFrame frame = new JFrame("Label Example"); 
JLabel label = new JLabel("Hello, World!"); frame.add(label); frame.setSize(300, 200); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true); 
} 
}