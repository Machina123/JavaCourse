package net.machina.interfacedemo.figures;

public abstract class Solid implements IFigureKind, IFigureArea, IFigureVolume, Comparable<Solid> {

    protected String kind;

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public int compareTo(Solid o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }
}
