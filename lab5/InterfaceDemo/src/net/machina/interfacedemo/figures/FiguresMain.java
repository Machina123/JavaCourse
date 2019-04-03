package net.machina.interfacedemo.figures;

public class FiguresMain {
    public static void main(String[] args) {
        Circle k1 = new Circle(2);
        Circle k2 = new Circle(2);
        Circle k3 = new Circle(4);
        Rectangle p1 = new Rectangle(2,3);

        System.out.println(k1.equals(k1));
        System.out.println(k1.equals(k2));
        System.out.println(k2.equals(k1));
        System.out.println(k1.equals(k3));
        System.out.println(k1.equals(p1));
    }
}
