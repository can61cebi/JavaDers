import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCircle extends JFrame {

    private JButton jbtnenlarge = new JButton("Enlarge");
    private JButton jbtnsmall = new JButton("Small");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle() {
        JPanel panel = new JPanel();
        panel.add(jbtnenlarge);
        panel.add(jbtnsmall);
        this.add(panel, BorderLayout.SOUTH);
        this.add(canvas,BorderLayout.CENTER);
        jbtnenlarge.addActionListener(new EnlargeListener());
    }
    public static void main(String[] args) {

        JFrame frame = new ControlCircle();
        frame.setTitle("ControlCircle");
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class EnlargeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            canvas.enlarge();
        }
    }

    class CirclePanel extends JPanel {
        private int radius = 5;

        public void enlarge() {
            radius++;
            repaint();
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(getWidth()/2-radius, getHeight()/2-radius, 2*radius, 2*radius);
        }
    }
}
