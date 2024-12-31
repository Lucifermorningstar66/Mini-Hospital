import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
 * Created by JFormDesigner on Tue Nov 07 01:40:42 IRST 2023
 */



/**
 * @author global village
 */
public class Menu extends JFrame implements ActionListener {
    public Menu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("HospitaL");
        setIconImage(new ImageIcon("Hospital\\1.png").getImage());
        getContentPane().setBackground(new Color(0xFFFFFFFF,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("H O S P I T A L");
        label1.setForeground(new Color(0x000000));
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(100, 20), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("LogIn");
        button1.setBackground(new Color(0xFFFFFF));
        button1.setForeground(new Color(0x000000));
        button1.setBorder(new LineBorder(new Color(0xFF209EE0,true), 3));
        contentPane.add(button1);
        button1.setBounds(135, 75, 130, 50);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Exit");
        button2.setBackground(new Color(0xFFFFFF));
        button2.setForeground(new Color(0x000000));
        button2.setBorder(new LineBorder(new Color(0xFFD00E0E,true), 3));
        contentPane.add(button2);
        button2.setBounds(140, 135, 120, 40);
        button2.addActionListener(this::actionPerformed);

//        setLayout(new BorderLayout());
//        JLabel background = new JLabel(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Hospital\\2.png"));
//        add(background);
//        background.setLayout(new FlowLayout());
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
        setSize(410, 355);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;@Override




    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            MainPage mainPage = new MainPage();
        }
        if(e.getSource() == button2){
            dispose();
        }

    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}