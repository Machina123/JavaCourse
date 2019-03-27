package net.machina.interfacedemo.figures;

public class Cube extends Solid {
    private double side;

    public Cube(double side) {
        super();
        this.side = side;
        this.kind = "Sześcian";
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}
