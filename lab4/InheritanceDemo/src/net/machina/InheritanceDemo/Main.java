package net.machina.InheritanceDemo;

public class Main {
    public static void main(String[] args) {

        Rectangle[] prostokaty = new Rectangle[4];
        prostokaty[0] = new Rectangle(3,4);
        prostokaty[1] = new Rectangle(2.5, 4.5);
        prostokaty[2] = new Square(30);
        prostokaty[3] = new Square(Math.PI);

        for(Rectangle r : prostokaty) {
            System.out.printf("Pole: %f, Obwod: %f\n", r.getArea(), r.getPerimeter());
        }

    }
}
