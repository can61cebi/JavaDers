import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame {

    private JTextField tfcount;
    private JButton buttonUp, buttonDown, buttonReset;
    private int count = 0;

    public Counter() {
        setLayout(new FlowLayout());

        add(new JLabel("Counter"));
        tfcount = new JTextField("0", 10);
        tfcount.setEditable(false);
        add(tfcount);

        buttonUp = new JButton("Increase");
        add(buttonUp);
        buttonUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ++count;
                tfcount.setText(count + "");
            }
        });

        buttonDown = new JButton("Decrease");
        add(buttonDown);
        buttonDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                tfcount.setText(count + "");
            }
        });

        buttonReset = new JButton("Reset");
        add(buttonReset);
        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 0;
                tfcount.setText("0");
            }
        });

        setTitle("Counter");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
