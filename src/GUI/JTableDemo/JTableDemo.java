package GUI.JTableDemo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JTableDemo {
    private JFrame window;

    public JTableDemo(){
        String[][] values = {
                {"1","chief","class"},
                {"2","chief","class"},
                {"3","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
                {"4","chief","class"},
        };
        String[] columns = {"number","name","class"};


        window = new JFrame("Table window");
        JTable table = new JTable(values,columns);

        table.setCellSelectionEnabled(true);

        ListSelectionModel selector = table.getSelectionModel();
        selector.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selector.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = table.getSelectedRows();
                int[] columns = table.getSelectedColumns();

                for (int row : rows) {
                    for (int column : columns) {
                        System.out.println("Selected value: " + table.getValueAt(row,column));
                    }
                }
            }
        });

        window.add(new JScrollPane(table), BorderLayout.CENTER);
//        window.add(table, BorderLayout.CENTER);
        window.setSize(500,400);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
