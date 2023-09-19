package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.jar.JarFile;

public class dashboard extends JFrame implements ActionListener {
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
        l.setForeground(new Color(238, 255, 0));
        l.setFont(new Font("RALEWAY", Font.BOLD, 50));
        l.setBounds(50, 20, 400, 200); // Adjust the position as needed
        image1.add(l);

        JLabel l2 = new JLabel("NOTES");
        l2.setForeground(new Color(255, 255, 255));
        l2.setFont(new Font("RALEWAY", Font.BOLD, 50));
        l2.setBounds(50, 80, 400, 200); // Adjust the position as needed
        image1.add(l2);

        JLabel l3 = new JLabel("IN");
        l3.setForeground(new Color(238, 255, 0));
        l3.setFont(new Font("RALEWAY", Font.BOLD, 50));
        l3.setBounds(50, 130, 400, 200); // Adjust the position as needed
        image1.add(l3);

        JLabel l4 = new JLabel("EASY STEPS");
        l4.setForeground(new Color(255, 255, 255));
        l4.setFont(new Font("RALEWAY", Font.BOLD, 50));
        l4.setBounds(50, 180, 400, 200); // Adjust the position as needed
        image1.add(l4);


        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("new.png"));
        Image icon1 = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(icon1);

        NEW = new JButton("New");
        NEW.setBounds(50,390,150,45);
        NEW.setForeground(new Color(238, 255, 0));
        NEW.setBackground(Color.black);
        NEW.setBorderPainted(false);
        NEW.setIcon(icon2);
        NEW.addActionListener(this);
        NEW.setFont(new Font("RALEWAY", Font.BOLD, 18));
        NEW.setFocusable(false);
        image1.add(NEW);


        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("open.png"));
        Image iconnn = iconn.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon iconnnn = new ImageIcon(iconnn);
        open = new JButton("Open");
        open.setBounds(260,390,150,45);
        open.setForeground(new Color(238, 255, 0));
        open.setBackground(Color.black);
        open.setBorderPainted(false);
        open.setIcon(iconnnn);
        open.addActionListener(this);
        open.setFont(new Font("RALEWAY", Font.BOLD, 18));
        open.setFocusable(false);
        image1.add(open);


        ImageIcon Icon = new ImageIcon(ClassLoader.getSystemResource("help.png"));
        Image Icon1 = Icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon Icon2 = new ImageIcon(Icon1);

        help = new JButton("Help");
        help.setBounds(50,460,150,45);
        help.setForeground(new Color(238, 255, 0));
        help.setBackground(Color.black);
        help.setBorderPainted(false);
        help.setIcon(Icon2);
        help.addActionListener(this);
        help.setFont(new Font("RALEWAY", Font.BOLD, 18));
        help.setFocusable(false);
        image1.add(help);


        exit = new JButton("Exit");
        exit.setBounds(260,460,150,45);
        exit.setForeground(new Color(238, 255, 0));
        exit.setBackground(new Color(0, 0, 0));
        exit.setBorderPainted(false);
        exit.setIcon(icon2);
        exit.addActionListener(this);
        exit.setFont(new Font("RALEWAY", Font.BOLD, 18));
        exit.setFocusable(false);
        image1.add(exit);

        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == NEW){
                new NewNotes();
        }else if(e.getSource() == help){
                new HelpClass();
        }else if(e.getSource() == open){
            setVisible(false);
            OpenNotes o = new OpenNotes();
//            new OpenNotes();

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
            fileChooser.addChoosableFileFilter(restrict);
            int action = fileChooser.showOpenDialog(this);

            if (action != JFileChooser.APPROVE_OPTION) {
                return;
            } else {
                File files = fileChooser.getSelectedFile();

                try {
                    BufferedReader br = new BufferedReader(new FileReader(files));
                    try {
                        o.area.read(br, null);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }else if(e.getSource() == exit){
            setVisible(false);
            new Main();
        }
    }
}
