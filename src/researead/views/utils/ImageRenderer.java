package researead.views.utils;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        if (value != null) {
            byte[] imageData = (byte[]) value;
            ImageIcon icon = new ImageIcon(imageData);
            
            int cellHeight = table.getRowHeight(row);
            int originalWidth = icon.getIconWidth();
            int originalHeight = icon.getIconHeight();
            
            double scaleFactor = (double) cellHeight / originalHeight;
            int scaledWidth = (int) (originalWidth * scaleFactor);
            int scaledHeight = cellHeight;
            
            Image scaledImage = icon.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
        } else {
            label.setIcon(null);
        }

        return label;
    }
}

