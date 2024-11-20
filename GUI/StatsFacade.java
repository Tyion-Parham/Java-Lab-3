package GUI;

//Facade Pattern

import Data.Game_Stats;
import Data.Main;
import java.util.List;

public class StatsFacade {

    private StatsTable statsTable;
    private SortPanel sortPanel;

    public StatsFacade() {
        String statsFile = "/C://Users//typar//Downloads//Feb_3_Game_Stats.txt/";
        List<Game_Stats> playerStats = Main.processRawStatsFile(statsFile);

        this.statsTable = new StatsTable(playerStats);
        this.sortPanel = new SortPanel(statsTable);
    }

    public StatsTable getStatsTable() {
        return statsTable;
    }

    public SortPanel getSortPanel() {
        return sortPanel;
    }
}
