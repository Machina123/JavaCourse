package net.machina.interfacedemo.figures;

public class Circle extends Figure implements IFigureArea {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.kind = "Koło";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
