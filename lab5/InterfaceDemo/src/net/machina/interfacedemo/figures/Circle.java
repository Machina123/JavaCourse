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

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if(this == obj) return true;
        else if(this.getClass() != obj.getClass()) return false;
        else if(!this.getKind().equals(((Circle)obj).getKind()) || this.getArea() != ((Circle) obj).getArea()) return false;
        else return true;
    }
}
