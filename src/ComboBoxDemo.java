import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.*;
public class ComboBoxDemo extends JFrame {

    private String[] bayrak = {"Canada", "Türkiye", "Denmark", "France", "Germany", "India", "Norway", "England", "USA"};

    private ImageIcon[] bayrakImage = {new ImageIcon("ca.jpg"), new ImageIcon("tr.jpg"), new ImageIcon("dk.jpg"), new ImageIcon("fr.jpg")
            , new ImageIcon("de.jpg"), new ImageIcon("in.jpg"), new ImageIcon("nw.jpg"), new ImageIcon("en.jpg"), new ImageIcon("usa.jpg")};

    private String[] flagDescription = new String[9];
    private DescriptionPanel descriptionPanel = new DescriptionPanel();
    private JComboBox jComboBox = new JComboBox(bayrak);

    public ComboBoxDemo() {

        flagDescription[0] = "Canada Flag"; flagDescription[1] = "Türkiye Flag"; flagDescription[2] = "Denmark Flag"; flagDescription[3] = "France Flag";
        flagDescription[4] = "Germany Flag"; flagDescription[5] = "India Flag"; flagDescription[6] = "Norway Flag"; flagDescription[7] = "Englans Flag";
        flagDescription[8] = "USA Flag";

        setDisplay(0);

        add(jComboBox, BorderLayout.NORTH);
        add(descriptionPanel, BorderLayout.CENTER);

        jComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                setDisplay(jComboBox.getSelectedIndex());
            }
        });
    }

    public void setDisplay(int index){
        descriptionPanel.setTitle(bayrak[index]);
        descriptionPanel.setImageIcon(bayrakImage[index]);
        descriptionPanel.setDescription(flagDescription[index]);
    }
    public static void main(String[] args) {

        ComboBoxDemo frame = new ComboBoxDemo();
        frame.setSize(250,150);
        frame.setTitle("ComboBox");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
