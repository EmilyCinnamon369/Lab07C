import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleshipFrame extends JFrame{

    public BattleshipFrame() {

        setTitle("Battleship");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font font1 = new Font("Times New Roman", Font.BOLD, 56);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 18);
        Font font3 = new Font("Times New Roman", Font.PLAIN, 14);

        JLabel jabel = new JLabel("Battleship", JLabel.CENTER);
        jabel.setBounds(20, 50, 600, 100);
        jabel.setFont(font1);

        JTextArea jerria = new JTextArea("");
        jerria.setFont(font3);

        JScrollPane jane = new JScrollPane(jerria);
        jane.setBounds(300, 200, 300, 300);

        JTextArea a1 = new JTextArea("Coordinate 1 (enter a number between 1 and 10)");
        a1.setFont(font3);
        a1.setBounds(20, 200, 400, 50);

        JTextArea a2 = new JTextArea("Coordinate 2 (enter a number between 1 and 10)");
        a2.setFont(font3);
        a2.setBounds(20, 300, 400, 50);

        int[][] board = new int[10][10];

        // ship 1
        int x = (int) ((Math.random()*8)+2);
        int y = (int) ((Math.random()*8)+2);



        JButton read_butt = new JButton("Attack");
        read_butt.setBounds(40, 515, 200, 25);
        read_butt.setFont(font2);
        read_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jerria.append("\nMISS");

            }
        });

        JButton quit_butt = new JButton("Quit");
        quit_butt.setBounds(440, 515, 200, 25);
        quit_butt.setFont(font2);
        quit_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(jabel);
        add(jane);
        add(read_butt);
        add(quit_butt);
        add(a1);
        add(a2);

        setVisible(true);

    }}