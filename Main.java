package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton back, next;
    Main() {
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


        JLabel l = new JLabel("Welcome");
        l.setForeground(new Color(238, 255, 0));
        l.setFont(new Font("RALEWAY", Font.BOLD, 70));
        l.setBounds(20, 100, 350, 200); // Adjust the position as needed
        image1.add(l);

        JLabel l1 = new JLabel("TAKE YOUR");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("RALEWAY", Font.PLAIN, 40));
        l1.setBounds(30, 190, 350, 200); // Adjust the position as needed
        image1.add(l1);

        JLabel l2 = new JLabel("NOTES");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("RALEWAY", Font.BOLD, 40));
        l2.setBounds(30, 240, 350, 200); // Adjust the position as needed
        image1.add(l2);

        next = new JButton("NEXT");
        next.setForeground(new Color(238, 255, 0));
        next.setBackground(Color.black);
        next.setBorderPainted(false);
        next.setFont(new Font("RALEWAY", Font.BOLD, 11));
        next.setFocusable(false);
        next.addActionListener(this);
        next.setBounds(30, 450, 70, 30); // Adjust the position as needed
        image1.add(next);

        back = new JButton("Back");
        back.setForeground(new Color(165, 178, 1));
        back.setBackground(Color.black);
        back.setBorderPainted(false);
        back.setFont(new Font("RALEWAY", Font.PLAIN, 11));
        back.setFocusable(false);
        back.addActionListener(this);
        back.setBounds(270, 450, 70, 30); // Adjust the position as needed
        image1.add(back);

        setUndecorated(true);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            System.exit(0);
        }else if(e.getSource() == next){
            new dashboard();
            setVisible(false);
        }
    }
}