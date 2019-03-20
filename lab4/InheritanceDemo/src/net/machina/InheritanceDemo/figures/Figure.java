package net.machina.InheritanceDemo.figures;

public abstract class Figure {

    private String kind;

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void rescale(double scale);

    protected void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return this.kind;
    }
}
