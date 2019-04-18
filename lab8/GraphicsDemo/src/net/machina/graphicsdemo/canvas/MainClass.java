package net.machina.graphicsdemo.canvas;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MainFrame("Okno główne").setVisible(true);
        });
    }
}
