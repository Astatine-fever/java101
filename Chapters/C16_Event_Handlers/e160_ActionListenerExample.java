package Chapters.C16_Event_Handlers;

import javax.swing.*;
import java.awt.event.*;

public class e160_ActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Listener Example");
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}