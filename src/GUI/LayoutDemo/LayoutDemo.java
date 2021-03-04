package GUI.LayoutDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutDemo {
    private JFrame mainWindow;
    private JPanel panelOne;
    private JPanel panelTwo;
    private JTextField firstName;
    private JTextField secondName;


    public LayoutDemo(){
        layoutInit();
    }

    public void layoutInit(){
        mainWindow = new JFrame();
        panelOne  = new JPanel();
        panelTwo  = new JPanel();
        firstName = new JTextField("First name");
        secondName = new JTextField("Second name");

//        panelOne.setLayout(new BoxLayout(panelOne,BoxLayout.X_AXIS));
        panelOne.setLayout(new FlowLayout());
        panelOne.setBorder(BorderFactory.createTitledBorder("Form"));

        panelTwo.setBackground(Color.getHSBColor(90,100,50));

//        mainWindow.setLayout(new GridLayout(2,1));
        mainWindow.setLayout(new GridLayout(2,1));
        mainWindow.setSize(600,500);

        JButton submit = new JButton("submit");
        JButton cancel = new JButton("cancel");

        submit.setSize(50,20);

//        mainWindow.add(submit);
//        mainWindow.add(cancel);

        panelOne.add(firstName);
        panelOne.add(secondName);
        panelOne.add(submit);
        panelOne.add(cancel);
        
        

        mainWindow.add(panelOne);
        mainWindow.add(panelTwo);

        mainWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                mainWindow.dispose();
                System.exit(0);
            }
        });

        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {
        LayoutDemo demo = new LayoutDemo();
    }
}
