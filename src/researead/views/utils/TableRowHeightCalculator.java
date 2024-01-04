package researead.views.utils;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableRowHeightCalculator {
    
    public static int calculatePreferredRowHeight(JTable table, int rowIndex) {
        int maxHeight = 0;
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            TableCellRenderer cellRenderer = table.getCellRenderer(rowIndex, columnIndex);
            Component cellComponent = table.prepareRenderer(cellRenderer, rowIndex, columnIndex);
            int cellHeight = cellComponent.getPreferredSize().height;
            maxHeight = Math.max(maxHeight, cellHeight);
        }
        return maxHeight;
    }
}
