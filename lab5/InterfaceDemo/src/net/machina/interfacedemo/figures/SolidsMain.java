package net.machina.interfacedemo.figures;

public class SolidsMain {
    public static void main(String[] args) {
        Solid[] solids = {
                new Orb(5),
                new Cube(3),
                new Orb(9),
                new Cube(4.5),
                new Orb(2.5),
                new Cube(10)
        };

        for(Solid s : solids) {
            System.out.printf("%s - powierzchnia: %f , objętość: %f\n", s.getKind(), s.getArea(), s.getVolume());
        }
    }
}
