import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class LoanCalculator extends JFrame{

    private JTextField txtAnnual = new JTextField();
    private JTextField txtYears = new JTextField();
    private JTextField txtAmount = new JTextField();
    private JTextField txtMonthly = new JTextField();
    private JTextField txtTotal = new JTextField();

    private JButton btnCompute = new JButton("Hesapla");

    public LoanCalculator() {
        JPanel p1 = new JPanel(new GridLayout(5,2));
        p1.add(new JLabel("Yillik Faiz Orani:"));
        p1.add(txtAnnual);
        p1.add(new JLabel("Yil:"));
        p1.add(txtYears);
        p1.add(new JLabel("Borc Miktari:"));
        p1.add(txtAmount);
        p1.add(new JLabel("Aylik Odeme:"));
        p1.add(txtMonthly);
        p1.add(new JLabel("Toplam Ucret:"));
        p1.add(txtTotal);

        p1.setBorder(new TitledBorder("Borc miktarini, faiz oranini ve yil girin"));


        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(btnCompute);

        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        btnCompute.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            double interest = Double.parseDouble(txtAnnual.getText());
            int year = Integer.parseInt(txtYears.getText());
            double loanAmount = Double.parseDouble(txtAmount.getText());

            Loan loan = new Loan(interest,year,loanAmount);
            txtMonthly.setText(String.format("%.2f",loan.getMonthlyPayment()));
            txtTotal.setText(String.format("%.2f",loan.getTotalPayment()));
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new LoanCalculator();
        frame.setTitle("Demo");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}