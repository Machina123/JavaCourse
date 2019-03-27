package net.machina.interfacedemo.figures;

public abstract class Figure implements IFigureKind {
    protected String kind;

    @Override
    public String getKind() {
        return this.kind;
    }
}
