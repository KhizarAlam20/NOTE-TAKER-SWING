package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main(){
        setBounds(400,40,550,650);
        setLayout(null);
        setResizable(false);

        JPanel p = new JPanel();
        p.setBackground(Color.black);
        p.setBounds(0,0,550,650);
        add(p);


        JButton b = new JButton("GO");
        b.setFont(new Font("AERIAL", Font.PLAIN, 30));
        b.setBackground(Color.red);
        b.setBorderPainted(false);
        b.setSize(150,100);
//        b.setBounds(50,40,70,30);
        p.add(b);




        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
