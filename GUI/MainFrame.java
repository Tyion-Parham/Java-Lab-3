package GUI;
import Data.Game_Stats;
import Data.Main;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class MainFrame extends JFrame {
    private StatsFacade statsFacade;

    public MainFrame() {
        this.statsFacade = new StatsFacade();  // Initialize the facade

        JFrame statsFrame = new JFrame("NBA Stats");
        statsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1313, 700));
        mainPanel.setBackground(Color.GRAY);

        // Use facade to get the SortPanel and StatsTable
        SortPanel sortPanel = statsFacade.getSortPanel();
        StatsTable statsTable = statsFacade.getStatsTable();

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(sortPanel, BorderLayout.NORTH);
        mainPanel.add(statsTable, BorderLayout.CENTER);

        statsFrame.getContentPane().add(mainPanel);
        statsFrame.pack();
        statsFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
