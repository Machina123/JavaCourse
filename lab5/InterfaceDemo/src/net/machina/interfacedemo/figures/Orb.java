package net.machina.interfacedemo.figures;

public class Orb extends Solid {
    private double radius;

    public Orb(double radius) {
        super();
        this.radius = radius;
        this.kind = "Kula";
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
