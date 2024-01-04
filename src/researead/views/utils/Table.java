package researead.views.utils;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import researead.models.Book;
import researead.models.LibraryModel;

public class Table extends JTable {
    
    private Map<Integer, Book> rowToBookMap = new HashMap<>();
    
    public Table(){   
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bin, boolean bin1, int i, int i1){
                TableHeader header = new TableHeader(o + "", 24);
                if (i1 == 4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bin1, int i, int i1){
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bin1, i, i1);
                    com.setBackground(new Color(247, 246, 244));

                    setBorder(noFocusBorder);
                    if(selected){
                        com.setForeground(new Color(242, 116, 26));
                    }else{
                        com.setForeground(new Color(102, 102, 102));
                    }
                    setHorizontalAlignment(JLabel.CENTER);
                    return com;
            }
        });
        setDefaultEditor(Object.class, new NonEditableCellEditor());
    }
    private static class NonEditableCellEditor extends DefaultCellEditor {

        public NonEditableCellEditor() {
            super(new JComboBox()); // Use a dummy component
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return null; // Return null to make the cell not editable
        }

        @Override
        public Object getCellEditorValue() {
            return null;
        }
    }
    
    public void populateTable(LibraryModel libraryModel, String statusType) {
        Map<String, Book> userBooks = libraryModel.getUserBooks();
        Object[][] table = new Object[userBooks.size()][5];
        
        int row = 0;
        
        for(Map.Entry<String, Book> entry : userBooks.entrySet()) {
            Book book = entry.getValue();
            
            if (statusType.equals("All") || book.getStatus().equals(statusType)) {
                rowToBookMap.put(row, book);

                table[row][0] = book.getTitle();
                table[row][1] = book.getAuthor();
                table[row][2] = book.getStatus();
                table[row][3] = book.getCurrentPage() + " / " + book.getTotalPage();
                table[row][4] = book.getCoverBook();

                row++;
            }
        }
        
        String[] columnNames = {"Title", "Author", "Status", "Page", "Cover"};
        
        setModel(new javax.swing.table.DefaultTableModel(table, columnNames));
        
        for (int i = 0; i < getRowCount(); i++) {
            int preferredHeight = TableRowHeightCalculator.calculatePreferredRowHeight(this, i);
            setRowHeight(i, Math.max(preferredHeight, 150)); 
        }
        
        getColumnModel().getColumn(0).setPreferredWidth(200); // Title
        getColumnModel().getColumn(1).setPreferredWidth(200); // Author
        getColumnModel().getColumn(2).setPreferredWidth(180); // Status
        getColumnModel().getColumn(3).setPreferredWidth(180); // Page
        getColumnModel().getColumn(4).setPreferredWidth(550); // Cover
        
        for (int i = 0; i < getColumnCount(); i++) {
            getColumnModel().getColumn(i).setMaxWidth(200); // Adjust the maximum width as needed
        }
        
        setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
        getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    public Book getBookAtRow(int row) {
        return rowToBookMap.get(row);
    }
}
