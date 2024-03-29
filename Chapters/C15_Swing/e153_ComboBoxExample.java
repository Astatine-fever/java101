package Chapters.C15_Swing;

import javax.swing.*;

public class e153_ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box Example");
        String[] options = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}