import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandleEvent extends JFrame {

    public HandleEvent() {
        JButton ok = new JButton("ok");
        JButton cancel = new JButton("cancel");

        JPanel panel = new JPanel();
        panel.add(ok);
        panel.add(cancel);

        add(panel);

        okListener listener1 = new okListener();
        ok.addActionListener(listener1);

        cancelListener listener2 = new cancelListener();
        cancel.addActionListener(listener2);
    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("EventListener");
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class okListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("user clicked ok");
        }
    }
    class cancelListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("user clicked cancel");
        }
    }
}
