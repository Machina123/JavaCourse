package net.machina.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListsMain {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        lista.add("Wiesiek");
        lista.add("Czesiek");
        lista.add("Krzysiek");

        System.out.println("----- Wypisanie listy (foreach) ------");
        // to widzi programista
        for(String s : lista) {
            System.out.println(s);
        }

        System.out.println("----- Wypisanie listy (Iterator) -----");
        // a to widzi maszyna wirtualna Javy
        Iterator<String> iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        ListIterator<String> iter2 = lista.listIterator();
        iter2.next();
        iter2.add("Zenek");
        System.out.println("----- Dodanie elementu z wykorzystaniem ListIterator -----");
        for(String s : lista) {
            System.out.println(s);
        }

        ListIterator<String> iter3 = lista.listIterator();
        iter3.next();
        iter3.next();
        iter3.remove();
        System.out.println("----- Usuwanie elementu z wykorzystaniem ListIterator -----");
        for(String s : lista) {
            System.out.println(s);
        }
    }
}
