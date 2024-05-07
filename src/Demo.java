import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//new open save print
public class Demo  extends JFrame {

    public Demo() {
        JButton btnnew = new JButton("New");
        JButton btnopen = new JButton("Open");
        JButton btnsave = new JButton("Save");
        JButton btnprint = new JButton("Print");

        JPanel panel = new JPanel();
        panel.add(btnnew);
        panel.add(btnopen);
        panel.add(btnsave);
        panel.add(btnprint);

        add(panel);

        btnnew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("new proccess");
            }
        });

        btnopen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("open proccess");
            }
        });

        btnsave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("save proccess");
            }
        });

        btnprint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("print procces");
            }
        });
    }

    public static void main(String[] args)  {

        JFrame frame = new Demo();
        frame.setTitle("Demo");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
