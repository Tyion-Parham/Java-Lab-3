package GUI;

import Data.Game_Stats;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.Comparator;
import java.util.List;

public class StatsTable extends JPanel {
    private final JTable table;
    private TableRowSorter<StatsModel> sorter;

    public StatsTable(List<Game_Stats> data) {
        setLayout(new BorderLayout());

        StatsModel model = new StatsModel(data);
        table = new JTable(model);

        table.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void applySorting(String columnName, String value) {
        int columnIndex = StatsModel.getColumnIndex(columnName);
        if (columnIndex == -1) {
            return; // Invalid column name
        }

        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + value, columnIndex));
    }
}