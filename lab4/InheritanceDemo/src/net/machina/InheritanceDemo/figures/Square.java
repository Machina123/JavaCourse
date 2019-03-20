package net.machina.InheritanceDemo.figures;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        setKind("Kwadrat");
    }
}
