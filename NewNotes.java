package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class NewNotes extends JFrame implements ActionListener {
    JMenuItem newDocument, open, save, Print, Exit, Copy, Paste, Cut, help;
    JTextArea area;
    JScrollPane scrollPane;

    NewNotes() {
        //Set title
        setTitle("K213868");
        setBounds(485, 115, 450, 540);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //setting icon of the panel
////        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
//        Image icon = imageIcon.getImage();
//        setIconImage(icon);

        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        file.setForeground(Color.white);
        file.setFont(new Font("AERIAL", Font.BOLD, 15));

        newDocument = new JMenuItem("New");
        newDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newDocument.addActionListener(this);

        save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);

        Print = new JMenuItem("Print");
        Print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        Print.addActionListener(this);

        Exit = new JMenuItem("Exit");
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));
        Exit.addActionListener(this);

        file.add(newDocument);
        file.add(save);
        file.add(Print);
        file.add(Exit);


        JMenu edit = new JMenu("EDIT");
        edit.setForeground(Color.white);
        edit.setFont(new Font("AERIAL", Font.BOLD, 15));


        Copy = new JMenuItem("Copy");
        Copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        Copy.addActionListener(this);

        Paste = new JMenuItem("Paste");
        Paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        Paste.addActionListener(this);

        Cut = new JMenuItem("Cut");
        Cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        Cut.addActionListener(this);

        edit.add(Copy);
        edit.add(Paste);
        edit.add(Cut);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.setBackground(new Color(1, 28, 35));

        setJMenuBar(menuBar);


        area = new JTextArea("Type here!");
        area.setFont(new Font("AERIAL", Font.PLAIN, 18));
        area.setLineWrap(true);
        area.setBackground(new Color(5, 49, 61));
        area.setWrapStyleWord(true);
        area.setCursor(new Cursor(12));
        area.setForeground(Color.white);

        scrollPane = new JScrollPane(area);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane);

        //add(area);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {

        new NewNotes();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newDocument) {
            area.setText("");
        } else if (e.getSource() == save) {
            JFileChooser saves = new JFileChooser();
            saves.setApproveButtonText("SAVE");

            int action = saves.showOpenDialog(this);

            if (action != JFileChooser.APPROVE_OPTION) {
                return;
            } else {
                File files = new File(saves.getSelectedFile() + ".txt");
                BufferedWriter bW = null;
                try {
                    bW = new BufferedWriter(new FileWriter(files));
                    area.write(bW);
                } catch (Exception E) {

                }
            }
        } else if (e.getSource() == Print) {
            try {
                    area.print();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }else if(e.getSource() == Exit){
            setVisible(false);
            new dashboard();
        }
    }
}