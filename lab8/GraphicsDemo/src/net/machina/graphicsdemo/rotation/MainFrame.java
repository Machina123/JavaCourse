package net.machina.graphicsdemo.rotation;

import sun.tools.tree.BooleanExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class MainFrame extends JFrame {

    public static final int ANGLES = 60;
    private Dimension screen;
    private double centerX, centerY, endX, endY, radius = 100;
    private int currAngle = 0;
    private Timer timer;
    private Ellipse2D elipsa = null;
    private Line2D linia = null;
    private JPanel panelMain;

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
        panelMain = new MyPanel();
        add(panelMain, BorderLayout.CENTER);

        elipsa = new Ellipse2D.Double(100,100,200,200);
        centerX = 200;
        centerY = 200;
    }

    private void addListeners() {
        timer = new Timer(16, (event) -> {
            currAngle += 1;
            if(currAngle % 60 == 0) currAngle = 0;
            endX = centerX + (radius * Math.cos(currAngle * ((2 * Math.PI))/ANGLES));
            endY = centerY + (radius * Math.sin(currAngle * ((2 * Math.PI))/ANGLES));
            linia = new Line2D.Double(centerX, centerY, endX, endY);
            repaint();
        });
        timer.start();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

//    Workaround dla MacOS - renderuje się bez migotania
    class MyPanel extends JPanel {

        public MyPanel() {
            super(true);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.draw(elipsa);
            if(linia != null) g2d.draw(linia);
        }
    }
}
