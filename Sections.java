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
public class Sections extends JFrame implements ActionListener {
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\Hospital\\patientlist.txt");

    public Sections () {
        initComponents();
    }
    ImageIcon imageIcon1 = new ImageIcon("Hospital\\2.png");
    private void initComponents () {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();

        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);


        //---- label1 ----
        label1.setText("To Reserve A Room For A Patient Click On Your Desired One");
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.BOLD, 20));
        label1.setBackground(Color.black);
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(10, 0, 650, 50);

        //---- label2 ----
        label2.setText("SEC 1");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(115, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("SEC 2");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(315, 85), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("SEC 3");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(535, 85), label4.getPreferredSize()));

        //---- button1 ----
        button1.setText("ROOM 1");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button1);
        button1.setBounds(55, 125, 70, 40);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("ROOM 2");
        button2.setBackground(new Color(0xeeeeee));
        button2.setForeground(new Color(0x000000));
        button2.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button2);
        button2.setBounds(135, 125, 70, 40);
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("ROOM 1");
        button3.setBackground(new Color(0xeeeeee));
        button3.setForeground(new Color(0x000000));
        button3.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button3);
        button3.setBounds(260, 125, 70, 40);
        button3.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("ROOM 2");
        button4.setBackground(new Color(0xeeeeee));
        button4.setForeground(new Color(0x000000));
        button4.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button4);
        button4.setBounds(340, 125, 70, 40);
        button4.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("ROOM 1");
        button5.setBackground(new Color(0xeeeeee));
        button5.setForeground(new Color(0x000000));
        button5.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button5);
        button5.setBounds(480, 125, 70, 40);
        button5.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("ROOM 2");
        button6.setBackground(new Color(0xeeeeee));
        button6.setForeground(new Color(0x000000));
        button6.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button6);
        button6.setBounds(560, 125, 70, 40);
        button6.addActionListener(this::actionPerformed);

        //---- label5 ----
        label5.setText("SEC 4");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(220, 230), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("SEC 5");
        contentPane.add(label6);
        label6.setBounds(430, 230, 35, label6.getPreferredSize().height);

        //---- button7 ----
        button7.setText("ROOM 1");
        button7.setBackground(new Color(0xeeeeee));
        button7.setForeground(new Color(0x000000));
        button7.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button7);
        button7.setBounds(160, 270, 70, 40);
        button7.addActionListener(this::actionPerformed);

        //---- button8 ----
        button8.setText("ROOM 2");
        button8.setBackground(new Color(0xeeeeee));
        button8.setForeground(new Color(0x000000));
        button8.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button8);
        button8.setBounds(240, 270, 70, 40);
        button8.addActionListener(this::actionPerformed);

        //---- button9 ----
        button9.setText("ROOM 1");
        button9.setBackground(new Color(0xeeeeee));
        button9.setForeground(new Color(0x000000));
        button9.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button9);
        button9.setBounds(370, 270, 70, 40);
        button9.addActionListener(this::actionPerformed);

        //---- button10 ----
        button10.setText("ROOM 2");
        button10.setBackground(new Color(0xeeeeee));
        button10.setForeground(new Color(0x000000));
        button10.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button10);
        button10.setBounds(450, 270, 70, 40);
        button10.addActionListener(this::actionPerformed);

        //---- button11 ----
        button11.setText("Back");
        button11.setBackground(new Color(0xeeeeee));
        button11.setForeground(new Color(0x000000));
        button11.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button11);
        button11.setBounds(300, 350, 70, 40);
        button11.addActionListener(this::actionPerformed);


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
        setSize(705, 450);
        setVisible(true);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    public static boolean Reserved = false;
    public static int ReservedNum;




    public void roomChecker(int n){
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");

                System.out.println(Arrays.toString(list));
                Patient patient = new Patient(list[0],list[1],list[2],list[3]);

                if(Integer.parseInt(patient.getRoom())==n){
                    Reserved = true;
                    ReservedNum = Integer.parseInt(patient.getNumber());
                }
            }
        }catch (FileNotFoundException e2) {
            System.out.println("An error occurred.");
            e2.printStackTrace();
        }
    }




    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1){
            dispose();
            roomChecker(11);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button2){
            dispose();
            roomChecker(12);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button3){
            dispose();
            roomChecker(21);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button4){
            dispose();
            roomChecker(22);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button5){
            dispose();
            roomChecker(31);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button6){
            dispose();
            roomChecker(32);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button7){
            dispose();
            roomChecker(41);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button8){
            dispose();
            roomChecker(42);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button9){
            dispose();
            roomChecker(51);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button10){
            dispose();
            roomChecker(52);
            if (Reserved){Reserved reserved = new Reserved();}
            else {CreatePatient createPatient = new CreatePatient();}
        }
        if (e.getSource() == button11){
            dispose();
            ResourceManagement resourceManagement = new ResourceManagement();
        }

    }
}
