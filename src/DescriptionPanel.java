import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.*;
public class DescriptionPanel extends JPanel {

    private JLabel jlbImageTitle = new JLabel();
    private JTextArea jtaDescription = new JTextArea();

    public DescriptionPanel() {

        jlbImageTitle.setHorizontalAlignment(JLabel.CENTER);
        jlbImageTitle.setHorizontalTextPosition(JLabel.CENTER);
        jlbImageTitle.setVerticalTextPosition(JLabel.BOTTOM);

        jlbImageTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
        jtaDescription.setFont(new Font("Serif", Font.PLAIN, 14));

        jtaDescription.setLineWrap(true);
        jtaDescription.setWrapStyleWord(true);
        jtaDescription.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(jtaDescription);
        setLayout(new BorderLayout(5,5));
        add(scrollPane, BorderLayout.CENTER);
        add(jlbImageTitle,BorderLayout.WEST);
    }

    public void setTitle(String title) {

        jlbImageTitle.setText(title);
    }

    public void setImageIcon(ImageIcon icon) {

        jlbImageTitle.setIcon(icon);
    }

    public void setDescription(String text) {

        jtaDescription.setText(text);
    }
}
