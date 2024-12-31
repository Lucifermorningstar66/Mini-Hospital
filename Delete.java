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
public class Delete extends JFrame implements ActionListener {
    public Delete () {
        initComponents();
    }
    public static File file1 = new File("Hospital\\employeelist.txt");
    public static String filePath1 = "Hospital\\employeelist.txt";
    public static File file2 = new File("Hospital\\patientlist.txt");
    public static String filePath2 = "Hospital\\patientlist.txt";


    private void initComponents () {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Delete FOLK");
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
        label2.setForeground(Color.BLACK);



        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button1);
        button1.setBounds(60, 180, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Remove");
        button2.setBackground(new Color(0xeeeeee));
        button2.setForeground(new Color(0x000000));
        button2.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button2);
        button2.setBounds(205, 180, 125, 45);
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
        setSize(405, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static String name;
    public static String director;
    public static String genre;
    public static String timelen;
    public static String date;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button2;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            if (Patients.isPatient){
                Patients patients = new Patients();
            }else {
                Employees employees = new Employees();
            }
        }

        if(e.getSource() == button2){
            if (Patients.isPatient){
                try{
                    Scanner scanner = new Scanner(file2);
                    while (scanner.hasNextLine()){
                        String array = scanner.nextLine();
                        array = array.trim().substring(1,array.indexOf("]"));
                        array = array.replace(" ","");
                        String[] list = array.split(",");

                        System.out.println(Arrays.toString(list));

                        if(list[0].contains(textField1.getText())){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath2)));
                                content = content.replaceAll(list[0], " - ");
                                content = content.replaceAll(list[1], " - ");
                                content = content.replaceAll(list[2], " - ");
                                content = content.replaceAll(list[3], " - ");
                                Files.write(Paths.get(filePath2), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            break;
                        }
                    }
                }catch (FileNotFoundException e2) {
                    System.out.println("An error occurred.");
                    e2.printStackTrace();
                }

            }else {
                try{
                    Scanner scanner = new Scanner(file1);
                    while (scanner.hasNextLine()){
                        String array = scanner.nextLine();
                        array = array.trim().substring(1,array.indexOf("]"));
                        array = array.replace(" ","");
                        String[] list = array.split(",");

                        System.out.println(Arrays.toString(list));

                        if(list[0].contains(textField1.getText())){
                            try {
                                String content = new String(Files.readAllBytes(Paths.get(filePath1)));
                                content = content.replaceAll(list[0], " - ");
                                content = content.replaceAll(list[1], " - ");
                                content = content.replaceAll(list[2], " - ");
                                content = content.replaceAll(list[3], " - ");
                                Files.write(Paths.get(filePath1), content.getBytes());
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            break;
                        }
                    }
                }catch (FileNotFoundException e2) {
                    System.out.println("An error occurred.");
                    e2.printStackTrace();
                }
            }
            dispose();
            Deleted Deleted = new Deleted();
        }


    }
}





