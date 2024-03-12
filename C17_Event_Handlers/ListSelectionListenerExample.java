package Chapters.C17_Event_Handlers;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class ListSelectionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Selection Listener Example");
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");
        JList<String> list = new JList<>(model);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValue());
                }
            }
        });
        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}