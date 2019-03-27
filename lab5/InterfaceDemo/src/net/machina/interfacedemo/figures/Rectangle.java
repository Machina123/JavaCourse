package net.machina.interfacedemo.figures;

public class Rectangle extends Figure implements IFigureArea{

    private double width, height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
        this.kind = "Prostokąt";
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
