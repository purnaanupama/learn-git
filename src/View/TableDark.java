
package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableDark extends JTable {
    private final TableDarkHeader header1;
    private final TableDarkCell cell1;
    public TableDark() {
        header1 = new TableDarkHeader();
        cell1 = new TableDarkCell();
        getTableHeader().setDefaultRenderer(header1);
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, cell1);
        setRowHeight(30);
    }
    
    public void setColumnAlignment(int column,int align){
       header1.setAlignment(column, align);
    }
    public void setCellAlignment(int column,int align){
      cell1.setAlignment(column, align);
    }
public void fixTable(JScrollPane scroll){
  scroll.setVerticalScrollBar(new ScrollBarCustom());
  JPanel panel = new JPanel();
  panel.setBackground(new Color(30, 30, 30));
  scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel);
  scroll.getViewport().setBackground(new Color(30,30,30));
}
    private class TableDarkHeader extends DefaultTableCellRenderer {
        
        private Map<Integer,Integer>alignment = new HashMap<>();
        public void setAlignment(int column,int align){
          alignment.put(column, align);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int i, int i1) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, i, i1);
            com.setBackground(new Color(30, 30, 30)); // Set the background color
            com.setForeground(new Color(200, 200, 200)); // Set the text color
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            if(alignment.containsKey(i1)){
             setHorizontalAlignment(alignment.get(i1));
            }else{
              setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }

    public class TableDarkCell extends DefaultTableCellRenderer {
        
      private Map<Integer,Integer>alignment = new HashMap<>();
        public void setAlignment(int column,int align){
          alignment.put(column, align);
        }
           
        
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isCellSelected(row, column)) {
            if (row % 2 == 0) {
                    com.setBackground(new Color(33,103, 153));
                } else {
                    com.setBackground(new Color(29, 86, 127));
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(50, 50, 50));
                } else {
                    com.setBackground(new Color(30, 30, 30));
                }
            }
            com.setForeground(new Color(200,200,200));
            setBorder(new EmptyBorder(0,5,0,5));
             if(alignment.containsKey(column)){
             setHorizontalAlignment(alignment.get(column));
            }else{
              setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }
}