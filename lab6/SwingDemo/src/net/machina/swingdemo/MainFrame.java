package net.machina.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements Runnable, ActionListener {

    private JButton button1, button2, button3;
    private JPanel contentPanel;
    private JComboBox<String> combo;
    private String[] weekdays = {"poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela"};
    private JLabel label1;

    public MainFrame(String title) throws java.awt.HeadlessException {
        super(title);
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        setContentPane(contentPanel);

        button1 = new JButton("sub to pewdiepie");
        button2 = new JButton("bitch lasagna");
        button3 = new JButton("congratulations");

        combo = new JComboBox<>(weekdays);

        label1 = new JLabel();

        add(button1);
        add(button2);
        add(button3);
        add(combo);
        add(label1);

        ButtonClickListener bcl = new ButtonClickListener();
        button1.addActionListener(bcl);
        button2.addActionListener(e -> {
           JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(),
                   "T-series ain't nothing but a bitch lasagna");
        });
        button3.addActionListener(this);

        // a to jest lambda (ficzer z Javy 8)
        combo.addItemListener(e -> {
            label1.setText(e.getItem().toString());
        });
    }

    @Override
    public void run() {
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(),
                "it's a celebration!");
    }

    class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Did you do your part and subbed to Pewdiepie? "
                    + ((JButton)e.getSource()).getText());
        }
    }
}
