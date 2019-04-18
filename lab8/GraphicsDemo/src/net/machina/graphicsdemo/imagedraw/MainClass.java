package net.machina.graphicsdemo.imagedraw;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MainFrame("Okno główne - rysowanie zdjęć").setVisible(true);
        });
    }
}
