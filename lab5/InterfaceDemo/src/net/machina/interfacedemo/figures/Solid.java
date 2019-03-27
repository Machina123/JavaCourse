package net.machina.interfacedemo.figures;

public abstract class Solid implements IFigureKind, IFigureArea, IFigureVolume {

    protected String kind;

    @Override
    public String getKind() {
        return kind;
    }
}
