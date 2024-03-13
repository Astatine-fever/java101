package Chapters.C15_Swing;

import javax.swing.*;
import java.awt.*;

class MultiPageApp extends JFrame {

    private JTabbedPane tabbedPane;

    public MultiPageApp() {
        setTitle("Multi-Page App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create the menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Create the tabbed pane
        tabbedPane = new JTabbedPane();

        // Add tabs/pages to the tabbed pane
        tabbedPane.addTab("Page 1", createPage("Page 1 Content"));
        tabbedPane.addTab("Page 2", createPage("Page 2 Content"));
        tabbedPane.addTab("Page 3", createPage("Page 3 Content"));

        // Add the tabbed pane to the frame
        getContentPane().add(tabbedPane);

        setVisible(true);
    }

    private JPanel createPage(String content) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(content), BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MultiPageApp());
    }
}
