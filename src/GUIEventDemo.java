import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.*;
public class GUIEventDemo extends JFrame {

    private JLabel jlbMessage = new JLabel("Hello", JLabel.CENTER);
    private JCheckBox jcbxBold = new JCheckBox("Bold");
    private JCheckBox jcbxItalic = new JCheckBox("Italic");
    private JRadioButton jrbRed = new JRadioButton("Red");
    private JRadioButton jrbGreen = new JRadioButton("Green");
    private JRadioButton jrbBlue = new JRadioButton("Blue");
    private JTextField jtfMessage = new JTextField(10);

    public GUIEventDemo() {

        jlbMessage.setBorder(new LineBorder(Color.BLACK,2));
        add(jlbMessage,BorderLayout.CENTER);

        JPanel checkBox = new JPanel(new GridLayout(2,1));
        checkBox.add(jcbxBold);
        checkBox.add(jcbxItalic);
        add(checkBox, BorderLayout.EAST);

        JPanel radioButton = new JPanel(new GridLayout(3,1));
        radioButton.add(jrbRed);
        radioButton.add(jrbGreen);
        radioButton.add(jrbBlue);
        add(radioButton, BorderLayout.WEST);

        ButtonGroup b_group = new ButtonGroup();
        b_group.add(jrbRed);
        b_group.add(jrbGreen);
        b_group.add(jrbBlue);

        jrbBlue.setSelected(true);
        jlbMessage.setForeground(Color.BLUE);

        JPanel jpTextField = new JPanel(new BorderLayout(5,0));
        jpTextField.add(new JLabel("Enter a New Message"), BorderLayout.WEST);
        jpTextField.add(jtfMessage, BorderLayout.CENTER);
        jlbMessage.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(jpTextField, BorderLayout.NORTH);

        jcbxBold.setMnemonic('B');
        jcbxItalic.setMnemonic('I');
        jrbBlue.setMnemonic('B');
        jrbGreen.setMnemonic('G');
        jrbRed.setMnemonic('R');

        jrbRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbMessage.setForeground(Color.RED);
            }
        });

        jrbGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbMessage.setForeground(Color.GREEN);
            }
        });

        jrbBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbMessage.setForeground(Color.BLUE);
            }
        });

        jtfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jlbMessage.setText(jtfMessage.getText());
                jlbMessage.requestFocusInWindow();
            }
        });

        jcbxBold.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                setNewFont();
            }
        });

        jcbxItalic.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                setNewFont();
            }
        });
    }

    private void setNewFont() {

        int fontStyle = Font.PLAIN;
        fontStyle += (jcbxBold.isSelected()? Font.BOLD:Font.PLAIN);
        fontStyle += (jcbxItalic.isSelected()? Font.ITALIC:Font.PLAIN);

        Font font = jlbMessage.getFont();
        jlbMessage.setFont(new Font(font.getName(), fontStyle, font.getSize()));
    }

    public static void main(String[] args) {

        JFrame frame = new GUIEventDemo();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
