import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SourceDemo extends JFrame{
    JButton btnNew = new JButton("New");
    JButton btnOpen = new JButton("Open");
    JButton btnSave = new JButton("Save");
    JButton btnPrint = new JButton("Print");

    public SourceDemo() {
        JPanel panel = new JPanel();
        panel.add(btnNew);
        panel.add(btnOpen);
        panel.add(btnSave);
        panel.add(btnPrint);

        add(panel);

        ButtonListener listener = new ButtonListener();
        btnNew.addActionListener(listener);
        btnOpen.addActionListener(listener);
        btnSave.addActionListener(listener);
        btnPrint.addActionListener(listener);
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnNew) {
                System.out.println("New Process");
            }
            else if (e.getSource()==btnOpen)
                System.out.println("Open Process");
            else if (e.getSource()==btnSave)
                System.out.println("save Process");
            else if (e.getSource()==btnPrint)
                System.out.println("Print Process");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new Demo();
        frame.setTitle("Demo");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}