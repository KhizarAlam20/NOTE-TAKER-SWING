package SCD.GUI_TASK.NOTE_TAKER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class HelpClass extends JFrame implements ActionListener {
    JMenuItem Exit;
    JTextArea area;
    JScrollPane scrollPane;

    HelpClass() {

        //Set title
        setTitle("K213868");
        setBounds(485, 115, 450, 540);


        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        file.setForeground(Color.white);
        file.setFont(new Font("AERIAL", Font.BOLD, 15));


        Exit = new JMenuItem("Exit");
        Exit.addActionListener(this);
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));
        file.add(Exit);
        menuBar.add(file);


        menuBar.setBackground(new Color(1, 28, 35));

        setJMenuBar(menuBar);


        area = new JTextArea(
                "\n     Instruction Manual"
                +
                        "\n     -------------------------\n"
                +
                        "\n\n       1. CTRL + P to print"
                +
                        "\n\n       2. CTRL + S to save"
                +
                        "\n\n       3. CTRL + E to Exit"
                +
                        "\n\n       4. CTRL + C to Copy"
                +
                        "\n\n       5. CTRL + V to Paste"
                +
                        "\n\n       6. CTRL + N to New"
                +
                        "\n\n       7. Click open to Open Existing file"
        );
        area.setFont(new Font("AERIAL", Font.BOLD, 18));
        area.setLineWrap(true);
        area.setBackground(new Color(5, 49, 61));
        area.setWrapStyleWord(true);
        area.setCursor(new Cursor(12));
        area.setForeground(Color.white);
        area.setEditable(false);

        scrollPane = new JScrollPane(area);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane);

        //add(area);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelpClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Exit){
            setVisible(false);
//            new dashboard();
        }
    }
}
