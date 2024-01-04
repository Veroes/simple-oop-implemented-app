package researead.views.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class TableHeader extends JLabel {
    private final int fontSize;
    
    public TableHeader(String text, int fontSize){
        super(text);
        this.fontSize = fontSize;
        setOpaque(true);
        setBackground(new Color(240,240,240));
        setBorder(new EmptyBorder(10,5,10,5));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Segoe UI", Font.PLAIN, fontSize));
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230,230,230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight()-1);
    }
}
