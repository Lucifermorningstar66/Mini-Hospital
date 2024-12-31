import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.border.LineBorder;


/**
 * @author global village
 */
public class Reports extends JFrame implements ActionListener {
    public Reports () {
        initComponents();
    }
    public static File file1 = new File("Hospital\\employeelist.txt");
    public static String filePath1 = "Hospital\\employeelist.txt";
    public static File file2 = new File("Hospital\\patientlist.txt");
    public static String filePath2 = "Hospital\\patientlist.txt";


    private void initComponents () {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textArea1 = new JTextArea();
        label2 = new JLabel();
        button1 = new JButton();


        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("REPORTS");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(15, 15, 200, 40);

        //---- textArea1 ----
        textArea1.setBackground(new Color(0x69BFE5));
        contentPane.add(textArea1);
        textArea1.setBounds(20, 80, 550, 265);
        textArea1.setText(String.valueOf(ReportsFunc.rep));

        //---- label2 ----
        label2.setText("");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));
        label2.setForeground(Color.BLACK);


        //---- button1 ----
        button1.setText("Back");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button1);
        button1.setBounds(250, 380, 120, 45);
        button1.addActionListener(this::actionPerformed);



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
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextArea textArea1;
    private JLabel label2;
    private JButton button1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            MainPage mainPage = new MainPage();
        }


    }
}





