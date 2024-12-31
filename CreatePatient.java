import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.border.LineBorder;


/**
 * @author global village
 */
public class CreatePatient extends JFrame implements ActionListener {
    public CreatePatient() {
        initComponents();
    }
    public static File file = new File("Hospital\\patientlist.txt");
    public static ArrayList<String> Movies = new ArrayList<>();
    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("ADD PATIENT");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(15, 15, 200, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0x69BFE5));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 350, 45);

        //---- label2 ----
        label2.setText("Name");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));
        label2.setForeground(Color.black);

        //---- textField2 ----
        textField2.setBackground(new Color(0x69BFE5));
        contentPane.add(textField2);
        textField2.setBounds(20, 170, 350, 45);

        //---- label3 ----
        label3.setText("Number");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 155), label3.getPreferredSize()));
        label3.setForeground(Color.black);

        //---- textField4 ----
        textField4.setBackground(new Color(0x69BFE5));
        contentPane.add(textField4);
        textField4.setBounds(20, 245, 350, 45);


        //---- label4 ----
        label4.setText("Age");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 230), label4.getPreferredSize()));
        label4.setForeground(Color.black);

        //---- textField3 ----
        textField3.setBackground(new Color(0x69BFE5));
        contentPane.add(textField3);
        textField3.setBounds(20, 320, 350, 45);
        textField3.setText("Section + Room");


        //---- label5 ----
        label5.setText("Room Number");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 305), label5.getPreferredSize()));
        label5.setForeground(Color.black);


        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button1);
        button1.setBounds(70, 420, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Add");
        button2.setBackground(new Color(0xeeeeee));
        button2.setForeground(new Color(0x000000));
        button2.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button2);
        button2.setBounds(215, 420, 125, 45);
        button2.addActionListener(this::actionPerformed);

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
        setSize(405, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static String name;
    public static String number;
    public static String age;
    public static String room;

    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label5;
    private JButton button1;
    private JButton button2;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Patients patients = new Patients();
        }

        if(e.getSource() == button2){
            name = textField1.getText();
            number = textField2.getText();
            age = textField4.getText();
            room = textField3.getText();

           if(room.equals("11") ||
            room.equals("12") ||
            room.equals("21") ||
            room.equals("22") ||
            room.equals("31") ||
            room.equals("32") ||
            room.equals("41") ||
            room.equals("42") ||
            room.equals("51") ||
            room.equals("52")){
               Patient patient = new Patient(name,number,age,room);


               ArrayList<String> info = new ArrayList<>();
               info.add(name);
               info.add(number);
               info.add(age);
               info.add(room);


               try {
                   FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                   if (!file.exists()) {
                       file.createNewFile();
                   }
                   writer.write("\n" + info);
                   writer.close();

               } catch (IOException e2) {
                   throw new RuntimeException(e2);
               }

               dispose();
               Added patientAdded = new Added();
           }else {
               Error error = new Error();
           }

        }
    }




}