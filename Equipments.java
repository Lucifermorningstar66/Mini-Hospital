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
public class Equipments extends JFrame implements ActionListener {
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\Hospital\\equipmentlist.txt");

    public Equipments () {
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
        label1.setText("To Reserve A Equipment For A Patient Click On Your Desired One");
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.BOLD, 20));
        label1.setBackground(Color.black);
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(10, 0, 650, 50);



        //---- button1 ----
        button1.setText("EQ 1");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button1);
        button1.setBounds(100, 125, 70, 40);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("EQ 2");
        button2.setBackground(new Color(0xeeeeee));
        button2.setForeground(new Color(0x000000));
        button2.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button2);
        button2.setBounds(180, 125, 70, 40);
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("EQ 3");
        button3.setBackground(new Color(0xeeeeee));
        button3.setForeground(new Color(0x000000));
        button3.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button3);
        button3.setBounds(260, 125, 70, 40);
        button3.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("EQ 4");
        button4.setBackground(new Color(0xeeeeee));
        button4.setForeground(new Color(0x000000));
        button4.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button4);
        button4.setBounds(340, 125, 70, 40);
        button4.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("EQ 5");
        button5.setBackground(new Color(0xeeeeee));
        button5.setForeground(new Color(0x000000));
        button5.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button5);
        button5.setBounds(420, 125, 70, 40);
        button5.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("EQ 6");
        button6.setBackground(new Color(0xeeeeee));
        button6.setForeground(new Color(0x000000));
        button6.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button6);
        button6.setBounds(500, 125, 70, 40);
        button6.addActionListener(this::actionPerformed);

        //---- button7 ----
        button7.setText("EQ 7");
        button7.setBackground(new Color(0xeeeeee));
        button7.setForeground(new Color(0x000000));
        button7.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button7);
        button7.setBounds(180, 175, 70, 40);
        button7.addActionListener(this::actionPerformed);

        //---- button8 ----
        button8.setText("EQ 8");
        button8.setBackground(new Color(0xeeeeee));
        button8.setForeground(new Color(0x000000));
        button8.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button8);
        button8.setBounds(260, 175, 70, 40);
        button8.addActionListener(this::actionPerformed);

        //---- button9 ----
        button9.setText("EQ 9");
        button9.setBackground(new Color(0xeeeeee));
        button9.setForeground(new Color(0x000000));
        button9.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button9);
        button9.setBounds(340, 175, 70, 40);
        button9.addActionListener(this::actionPerformed);

        //---- button10 ----
        button10.setText("EQ 10");
        button10.setBackground(new Color(0xeeeeee));
        button10.setForeground(new Color(0x000000));
        button10.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button10);
        button10.setBounds(420, 175, 70, 40);
        button10.addActionListener(this::actionPerformed);

        //---- button11 ----
        button11.setText("Back");
        button11.setBackground(new Color(0xeeeeee));
        button11.setForeground(new Color(0x000000));
        button11.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button11);
        button11.setBounds(300, 250, 70, 40);
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
        setSize(705, 400);
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
    public static String eqNum;




    public void eqChecker(int n){
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");

                System.out.println(Arrays.toString(list));
                Equipment equipment = new Equipment(list[0],list[1]);
                eqNum = String.valueOf(n);

                if(Integer.parseInt(equipment.getNumber())==n){
                    Reserved = true;
                    ReservedNum = Integer.parseInt(equipment.getPatNumber());
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
            eqChecker(1);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(1);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button2){
            dispose();
           eqChecker(2);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(2);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button3){
            dispose();
            eqChecker(3);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(3);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button4){
            dispose();
            eqChecker(4);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(4);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button5){
            dispose();
            eqChecker(5);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(5);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button6){
            dispose();
            eqChecker(6);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(6);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button7){
            dispose();
            eqChecker(7);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(7);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button8){
            dispose();
            eqChecker(8);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(8);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button9){
            dispose();
            eqChecker(9);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(9);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button10){
            dispose();
            eqChecker(10);
            if (Reserved){EqReserved reserved = new EqReserved();}
            else {eqNum = String.valueOf(10);
                EquipmentReserve equipmentReserve = new EquipmentReserve();}
        }
        if (e.getSource() == button11){
            dispose();
            ResourceManagement resourceManagement = new ResourceManagement();
        }

    }
}
