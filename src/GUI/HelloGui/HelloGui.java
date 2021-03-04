package GUI.HelloGui;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class HelloGui {
    private Frame mainWindow;
    private JFrame mainWindow2;
    private JLabel header;

    public HelloGui(){
        UIInit();
    }

    public void UIInit(){
        mainWindow = new Frame("Form awt");
        mainWindow.setSize(1000,600);
        mainWindow.setVisible(true);


        header = new JLabel("Header table");


        mainWindow2 = new JFrame("From swing");
        mainWindow2.add(header);
        mainWindow2.setSize(800,500);
        mainWindow2.getContentPane().setBackground(Color.getHSBColor(30,30,30));
        mainWindow2.setVisible(true);

    }

    public static void main(String[] args) {
        HelloGui myUi =  new HelloGui();
    }
}
