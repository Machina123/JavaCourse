package net.machina.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> listaImion = new LinkedList<>();
        List<Integer> listaLiczb = new LinkedList<>();

        listaImion.add("Wiesiek");
        listaImion.add("Czesiek");
        listaImion.add("Zenek");
        listaImion.add("Krzysiek");
        listaImion.add("Popek");

        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(3);

        ListIterator<Integer> iterL = listaLiczb.listIterator();
        ListIterator<String> iterI = listaImion.listIterator();

        while(iterL.hasNext()) {
            iterI.next();
            iterI.add(iterL.next().toString());
        }

        while(iterI.hasNext()) {
            iterI.next();
            iterI.remove();
        }

        ListIterator<String> iterDisplay = listaImion.listIterator();
        while(iterDisplay.hasNext()) System.out.println(iterDisplay.next());
    }
}
