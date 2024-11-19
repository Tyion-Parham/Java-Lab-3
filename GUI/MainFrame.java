package GUI;
import Data.Game_Stats;
import Data.Main;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
        JFrame statsFrame = new JFrame("NBA Stats");
        statsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1313, 700));
        mainPanel.setBackground(Color.GRAY);

        String statsFile = "/C://Users//typar//Downloads//Feb_3_Game_Stats.txt/";
        List<Game_Stats> playerStats = Main.processRawStatsFile(statsFile);

        StatsTable statsTable = new StatsTable(playerStats);
        statsTable.setPreferredSize(new Dimension(1276, 650));

        SortPanel sortPanel = new SortPanel(statsTable);

        mainPanel.add(sortPanel, BorderLayout.NORTH);
        mainPanel.add(statsTable, BorderLayout.CENTER);


        statsFrame.getContentPane().add(mainPanel);
        statsFrame.pack();
        statsFrame.setVisible(true);
    }
}
