package net.machina.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> zbior = new HashSet<>();

        zbior.add("Romek");
        zbior.add("Janusz");
        zbior.add("Grażyna");

        for(String s : zbior) System.out.println(s);

        if(zbior.add("Janusz")) System.out.println("\nDodano element \"Janusz\"");
        else System.out.println("\nNie dodano elementu \"Janusz\"");

        for(String s : zbior) System.out.println(s);
    }
}
