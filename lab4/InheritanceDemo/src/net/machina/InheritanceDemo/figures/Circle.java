package net.machina.InheritanceDemo.figures;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) throws NonPositiveValueException{
        if(radius <= 0) throw new NonPositiveValueException();
        this.radius = radius;
        setKind("Koło");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void rescale(double scale) {
        radius *= scale;
    }
}
