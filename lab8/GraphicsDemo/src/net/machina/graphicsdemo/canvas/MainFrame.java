package net.machina.graphicsdemo.canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MainFrame extends JFrame {

    private Timer timer;
    private Point2D p1 = new Point2D.Double(5,5), p2 = new Point2D.Double(100,100);

    public MainFrame(String title) throws HeadlessException {
        super(title);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width / 2, screen.height / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // ustawia okno na środku ekranu

        timer = new Timer(1000, (event) -> {
            p1.setLocation(p1.getX() + 5, p1.getY());
            p2.setLocation(p2.getX() + 5, p2.getY());
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        drawLine(g2d, p1, p2);

        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D rect = new Rectangle2D.Double(100,100,300,200);
        g2d.draw(rect);

        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        Ellipse2D el = new Ellipse2D.Double(150,150,150,100);
        g2d.draw(el);
    }

    private void drawLine(Graphics2D g, Point2D start, Point2D end) {
        Line2D linia = new Line2D.Double(start, end);
        g.draw(linia);
    }

}
