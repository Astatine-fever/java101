package Chapters.C15_Swing;

import javax.swing.*; 
import java.awt.*;
public class e152_CheckBoxExample 
{ 
public static void main(String[] args) 
{ 
JFrame frame = new JFrame("Check Box Example"); 
JCheckBox checkBox1 = new JCheckBox("Option 1"); 
JCheckBox checkBox2 = new JCheckBox("Option 2"); frame.add(checkBox1); frame.add(checkBox2); frame.setLayout(new FlowLayout()); 
frame.setSize(300, 200); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true); 
} 
}