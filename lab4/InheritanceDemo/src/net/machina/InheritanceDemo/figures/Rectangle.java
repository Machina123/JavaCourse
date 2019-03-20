package net.machina.InheritanceDemo.figures;

public class Rectangle extends Figure {
    private double width, height;

    public Rectangle(double width, double height) throws NonPositiveValueException{
        if(width <= 0 || height <= 0) throw new NonPositiveValueException();
        this.width = width;
        this.height = height;
        setKind("Prostokąt");
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void rescale(double scale) {
        width *= scale;
        height *= scale;
    }
}
