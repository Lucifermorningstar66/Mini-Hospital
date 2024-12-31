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
public class EquipmentReserve extends JFrame implements ActionListener {
    public EquipmentReserve () {
        initComponents();
    }
    public static File file = new File("Hospital\\equipmentlist.txt");
    public static File file1 = new File("Hospital\\patientlist.txt");


    private void initComponents () {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("EQUIPMENT RESERVE (" + Equipments.eqNum + ")");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(15, 15, 400, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0x69BFE5));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 350, 45);

        //---- label2 ----
        label2.setText("Patient Number");
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
        button2.setText("Reserve");
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
        setSize(415, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off

    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JButton button1;
    public boolean notfoundPat = true;
    private JButton button2;


    public void checker(int n){
        try{
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");

                System.out.println(Arrays.toString(list));
                Patient patient = new Patient(list[0],list[1],list[2],list[3]);


                if(Integer.parseInt(patient.getNumber()) == n){
                    notfoundPat = false;
                }
            }
        }catch (FileNotFoundException e2) {
            System.out.println("An error occurred.");
            e2.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Equipments equipments = new Equipments();
        }
        if(e.getSource() == button2){
            int n = Integer.parseInt(textField1.getText());
            checker(n);

            if (notfoundPat){
                Error error = new Error();
            }else{
                Equipment equipment = new Equipment(Equipments.eqNum,textField1.getText());

                ArrayList<String> info = new ArrayList<>();
                info.add(equipment.getNumber());
                info.add(equipment.getPatNumber());

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
                EqAdded patientAdded = new EqAdded();
            }
        }


    }
}





