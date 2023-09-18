package SCD.GUI_TASK.NOTE_TAKER;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class NewNotes extends JFrame {
//    JButton NEW,help,exit,open;
JTextArea t;
    NewNotes(){
        setBounds(400, 40, 450, 540);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);


        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0, 0, 450, 540);
        add(p);


        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new NewNotes();
    }


}

