import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.LineBorder;

/*
 * Created by JFormDesigner on Tue Dec 26 02:43:32 IRST 2023
 */



/**
 * @author global village
 */
public class MainPage extends JFrame implements ActionListener {
    public MainPage () {
        initComponents();
    }
    ImageIcon imageIcon1 = new ImageIcon("Hospital\\2.png");
    private void initComponents () {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);


        //---- label1 ----
        label1.setText("Welcome to Hospital Site, ADMIN");
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.BOLD, 20));
        label1.setBackground(Color.black);
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(10, 0, 425, 50);

        //---- label2 ----
        label2.setText(dtf.format(now));
        label2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 16));
        label2.setForeground(Color.black);
        contentPane.add(label2);
        label2.setBounds(10, 40, 180, 40);

        //---- button1 ----
        button1.setText("Folk Management");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        contentPane.add(button1);
        button1.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        button1.setBounds(75, 145, 165, 70);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Resource Management");
        button2.setBackground(new Color(0xeeeeee));
        button2.setForeground(new Color(0x000000));
        contentPane.add(button2);
        button2.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        button2.setBounds(255, 145, 165, 70);
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("Reports");
        button3.setBackground(new Color(0xeeeeee));
        button3.setForeground(new Color(0x000000));
        button3.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button3);
        button3.setBounds(435, 145, 165, 70);
        button3.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("Exit");
        button4.setBackground(new Color(0xeeeeee));
        button4.setForeground(new Color(0x000000));
        button4.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button4);
        button4.setBounds(255, 230,165,60);
        button4.addActionListener(this::actionPerformed);


        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(705, 360);
        setVisible(true);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public boolean found = false;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH : mm : ss");
    private LocalDateTime now = LocalDateTime.now();






    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1){
            dispose();
            FolkManagement folkManagement = new FolkManagement();
        }
        if (e.getSource() == button2){
            dispose();
            ResourceManagement resourceManagement = new ResourceManagement();
        }
        if (e.getSource() == button3){
            dispose();
            ReportsFunc.reader();
            Reports reports = new Reports();
        }
        if (e.getSource() == button4){
            dispose();
        }
    }
}
