package Chapters.C16_Event_Handlers;

import javax.swing.*;
import java.awt.event.*;

public class ItemListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Item Listener Example");
        JCheckBox checkBox = new JCheckBox("Select Me");
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox Selected");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Checkbox Deselected");
                }
            }
        });
        frame.add(checkBox);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}