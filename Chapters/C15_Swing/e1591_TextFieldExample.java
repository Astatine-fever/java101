package Chapters.C15_Swing;

import javax.swing.*; 
public class e1591_TextFieldExample { 
public static void main(String[] args) { 
JFrame frame = new JFrame("Text Field Example"); JTextField textField = new JTextField(20); frame.add(textField); frame.setSize(300, 200); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true); 
} 
}