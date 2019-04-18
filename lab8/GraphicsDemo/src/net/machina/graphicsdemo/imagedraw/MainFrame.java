package net.machina.graphicsdemo.imagedraw;

import org.omg.CORBA.BAD_INV_ORDER;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MainFrame extends JFrame {

    private JPanel panelImage, panelControl;
    private JButton btnLoadImage;
    private JLabel lblImage, lblPath;
    private JFileChooser chooser;
    private JComboBox<String> comboSize = new JComboBox<>(new String[] {"100%", "50%", "25%"});
    private String imagePath;
    private Dimension screen;
    private int origW, origH, currW, currH;
    private ImageIcon icon;

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
        panelImage = new JPanel();
        btnLoadImage = new JButton("Załaduj obrazek...");
        lblImage = new JLabel();
        lblPath = new JLabel("Nie załadowano obrazka");

        panelImage.setBorder(BorderFactory.createRaisedBevelBorder());
        panelControl.setBorder(BorderFactory.createRaisedBevelBorder());

        add(panelControl, BorderLayout.SOUTH);
        add(panelImage, BorderLayout.CENTER);

        panelControl.add(comboSize);
        panelControl.add(btnLoadImage);
        panelControl.add(lblPath);
        panelImage.add(lblImage);

        chooser = new JFileChooser();
    }

    private void addListeners() {
        btnLoadImage.addActionListener((event) -> {
            JButton me = (JButton) event.getSource();
            JPanel myRoot = (JPanel) me.getParent();

            int response = chooser.showOpenDialog(myRoot.getParent());

            if(response == JFileChooser.APPROVE_OPTION) {
                imagePath = chooser.getSelectedFile().getAbsolutePath();
                lblPath.setText(imagePath);
                icon = new ImageIcon(imagePath);
                lblImage.setIcon(icon);
                origW = lblImage.getIcon().getIconWidth();
                origH = lblImage.getIcon().getIconHeight();
            }
        });

        comboSize.addItemListener((event) -> {
            double scale = 1;
            switch(event.getItem().toString()) {
                case "100%":
                    scale = 1;
                    break;
                case "50%":
                    scale = 0.5;
                    break;
                case "25%":
                    scale = 0.25;
                    break;
            }

            currW = (int) (origW * scale);
            currH = (int) (origH * scale);
            Image image = icon.getImage().getScaledInstance(currW, currH, Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon(image));
        });
    }

}
