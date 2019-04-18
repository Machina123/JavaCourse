package net.machina.graphicsdemo.training;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MainFrame extends JFrame {

    private Dimension screen;

    private Line2D linia = null;
    private Color selectedColor;

    private JPanel panelControl;
    private JTextField txtStartX, txtStartY, txtEndX, txtEndY;
    private JLabel lblStartX, lblStartY, lblEndX, lblEndY;
    private ButtonGroup groupColor;
    private JRadioButton radioColorRed, radioColorBlue;
    private JButton btnDraw;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width / 2, screen.height / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // ustawia okno na środku ekranu
        createComponents();
        addListeners();
    }


    private void createComponents() {
        panelControl = new JPanel();
        add(panelControl, BorderLayout.SOUTH);

        txtStartX = new JTextField(5);
        txtStartY = new JTextField(5);
        txtEndX = new JTextField(5);
        txtEndY = new JTextField(5);

        lblStartX = new JLabel("start X");
        lblEndX = new JLabel("end X");
        lblStartY = new JLabel("start Y");
        lblEndY = new JLabel("end Y");

        panelControl.add(lblStartX);
        panelControl.add(txtStartX);

        panelControl.add(lblStartY);
        panelControl.add(txtStartY);

        panelControl.add(lblEndX);
        panelControl.add(txtEndX);

        panelControl.add(lblEndY);
        panelControl.add(txtEndY);

        groupColor = new ButtonGroup();
        radioColorBlue = new JRadioButton("niebieski");
        radioColorBlue.setSelected(true);
        radioColorBlue.setActionCommand("blue");
        radioColorRed = new JRadioButton("czerwony");
        radioColorRed.setActionCommand("red");
        groupColor.add(radioColorBlue);
        groupColor.add(radioColorRed);
        panelControl.add(radioColorBlue);
        panelControl.add(radioColorRed);

        btnDraw = new JButton("Rysuj");
        panelControl.add(btnDraw);
    }

    private void addListeners() {
        btnDraw.addActionListener((event) -> {
            double startX, startY, endX, endY;
            startX = Double.parseDouble(txtStartX.getText());
            endX = Double.parseDouble(txtEndX.getText());
            startY = Double.parseDouble(txtStartY.getText());
            endY = Double.parseDouble(txtEndY.getText());

            switch(groupColor.getSelection().getActionCommand()) {
                case "blue":
                    selectedColor = Color.BLUE;
                    break;
                case "red":
                    selectedColor = Color.RED;
                    break;
            }

            linia = new Line2D.Double(new Point2D.Double(startX, startY), new Point2D.Double(endX, endY));
            repaint();
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(selectedColor);
        if(linia != null) {
            g2d.draw(linia);
        }
    }
}
