package Chapters.C16_Swing;

import javax.swing.*;

public class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Example");
        String[] options = { "Option 1", "Option 2", "Option 3" };
        JList<String> list = new JList<>(options);
        frame.add(list);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
