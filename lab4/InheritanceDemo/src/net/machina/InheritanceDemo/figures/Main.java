package net.machina.InheritanceDemo.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        try {
            figures.add(new Circle(4));
            figures.add(new Rectangle(3,4));
            figures.add(new Square(-3.5));
        } catch (NonPositiveValueException e) {
            e.printStackTrace();
        }

        for(Figure f : figures) {
            System.out.printf("Rodzaj: %s, Pole: %f, Obwód: %f\n", f.getKind(), f.getArea(), f.getPerimeter());
        }
        double scale = 0.5;
        System.out.println("Skalowanie: współczynnik skali = " + scale);

        for(Figure f : figures) {
            f.rescale(scale);
            System.out.printf("Rodzaj: %s, Pole: %f, Obwód: %f\n", f.getKind(), f.getArea(), f.getPerimeter());
        }
    }
}
