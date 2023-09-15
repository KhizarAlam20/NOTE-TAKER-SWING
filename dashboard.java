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


//        JLabel l = new JLabel("TAKE NOW");
//        l.setForeground(new Color(236, 255, 112));
//        l.setFont(new Font("RALEWAY", Font.BOLD, 70));
//        l.setBounds(20, 50, 400, 200); // Adjust the position as needed
//        image1.add(l);



        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("new.png"));
        Image icon1 = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(icon1);



        NEW = new JButton("New");
        NEW.setBounds(112,220,240,60);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 35));
        NEW.setFocusable(false);
        image1.add(NEW);


        NEW = new JButton("Open");
        NEW.setBounds(112,220,240,60);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 35));
        NEW.setFocusable(false);
        image1.add(NEW);


        NEW = new JButton("Help");
        NEW.setBounds(112,220,240,60);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 35));
        NEW.setFocusable(false);
        image1.add(NEW);

        NEW = new JButton("Exit");
        NEW.setBounds(112,220,240,60);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 35));
        NEW.setFocusable(false);
        image1.add(NEW);

        setVisible(true);
    }
    public static void main(String[] args) {
        new dashboard();
    }
}
