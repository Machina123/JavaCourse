package net.machina.interfacedemo.figures;

import java.util.Arrays;
import java.util.Comparator;

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

        System.out.println("\nSortowanie według objętości");
        Arrays.sort(solids);

        for(Solid s : solids) {
            System.out.printf("%s - powierzchnia: %f , objętość: %f\n", s.getKind(), s.getArea(), s.getVolume());
        }

        System.out.println("\nSortowanie według powierzchni");

//      Klasa wewnętrzna
        class AreaComparator implements Comparator<Solid> {
            @Override
            public int compare(Solid o1, Solid o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        }

        Arrays.sort(solids, new AreaComparator());

        for(Solid s : solids) {
            System.out.printf("%s - powierzchnia: %f , objętość: %f\n", s.getKind(), s.getArea(), s.getVolume());
        }

        System.out.println("\nSortowanie po nazwie");
        // wykorzystanie klasy anonimowej
        Arrays.sort(solids, new Comparator<Solid>() {
            @Override
            public int compare(Solid o1, Solid o2) {
                return o1.getKind().compareTo(o2.getKind());
            }
        });

        for(Solid s : solids) {
            System.out.printf("%s - powierzchnia: %f , objętość: %f\n", s.getKind(), s.getArea(), s.getVolume());
        }
    }
}
