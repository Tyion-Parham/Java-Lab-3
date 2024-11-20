package GUI;

//Command Pattern

public class SortCommand implements Command {
    private StatsTable statsTable;
    private String column;
    private String filterValue;

    public SortCommand(StatsTable statsTable, String column, String filterValue) {
        this.statsTable = statsTable;
        this.column = column;
        this.filterValue = filterValue;
    }

    @Override
    public void execute() {
        statsTable.applySorting(column, filterValue);  // Perform sorting on StatsTable
    }
}