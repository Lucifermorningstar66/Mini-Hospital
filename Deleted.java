import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
 * Created by JFormDesigner on Wed Nov 08 00:04:46 IRST 2023
 */



/**
 * @author global village
 */
public class Deleted extends JFrame implements ActionListener {
    public Deleted() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Deleted Successfully");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5f));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(65, 20), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("OK");
        button1.setBackground(new Color(0xeeeeee));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button1);
        button1.setBounds(150, 70, 110, 40);
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
        setSize(415, 170);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            if (Patients.isPatient){
                Patients patients = new Patients();
            }else {
                Employees employees = new Employees();
            }
        }
    }

    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}