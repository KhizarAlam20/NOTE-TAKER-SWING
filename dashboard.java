package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class dashboard extends JFrame {
    JButton NEW,help,exit,open;

    dashboard(){
        setBounds(400, 40, 450, 540);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);


        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0, 0, 450, 540);
        add(p);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
        Image img2 = img.getImage().getScaledInstance(450, 540, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image1 = new JLabel(img3);
        image1.setBounds(0, 0, 450, 540);
        p.add(image1);


        JLabel l = new JLabel("NOTE YOUR");
        l.setForeground(new Color(0, 245, 159));
        l.setFont(new Font("RALEWAY", Font.BOLD, 50));
        l.setBounds(50, 20, 400, 200); // Adjust the position as needed
        image1.add(l);



        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("new.png"));
        Image icon1 = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(icon1);

        NEW = new JButton("New");
        NEW.setBounds(50,390,150,45);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 25));
        NEW.setFocusable(false);
        image1.add(NEW);


        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("open.png"));
        Image iconnn = iconn.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon iconnnn = new ImageIcon(iconnn);
        NEW = new JButton("Open");
        NEW.setBounds(260,390,150,45);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(iconnnn);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 25));
        NEW.setFocusable(false);
        image1.add(NEW);


        ImageIcon Icon = new ImageIcon(ClassLoader.getSystemResource("help.png"));
        Image Icon1 = Icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon Icon2 = new ImageIcon(Icon1);

        NEW = new JButton("Help");
        NEW.setBounds(50,460,150,45);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(Icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 25));
        NEW.setFocusable(false);
        image1.add(NEW);


        NEW = new JButton("Exit");
        NEW.setBounds(260,460,150,45);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(new Color(0, 0, 0));
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 25));
        NEW.setFocusable(false);
        image1.add(NEW);

        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new dashboard();
    }
}
