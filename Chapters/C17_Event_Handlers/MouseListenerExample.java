package Chapters.C17_Event_Handlers;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked!");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed!");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released!");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered the canvas!");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited the canvas!");
            }
        });
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}