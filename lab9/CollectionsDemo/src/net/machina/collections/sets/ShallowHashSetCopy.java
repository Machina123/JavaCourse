package net.machina.collections.sets;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ShallowHashSetCopy {
    public static void main(String[] args) {
        System.out.println("--- Przed edycja zbior 1: ---");
        Set<SHCPerson> peopleSet1 = new HashSet<>();
        peopleSet1.add(new SHCPerson("Maria", LocalDate.of(2000,1,1)));
        peopleSet1.add(new SHCPerson("Zofia", LocalDate.of(2000,1,1)));
        peopleSet1.forEach(System.out::println);

        System.out.println("--- Przed edycja zbior 2: ---");
        Set<SHCPerson> peopleSet2 = new HashSet<>(peopleSet1);
        peopleSet2.forEach(System.out::println);

        Iterator<SHCPerson> iter1 = peopleSet1.iterator();
        iter1.forEachRemaining((object) -> object.setDataUr(LocalDate.of(2001,1,1)));

        System.out.println("--- Po edycji zbior 1: ---");
        peopleSet1.forEach(System.out::println);

        System.out.println("--- Po edycji zbior 2: ---");
        peopleSet2.forEach(System.out::println);
    }
}

class SHCPerson {
    private String imie;
    private LocalDate dataUr;

    public SHCPerson(String imie, LocalDate dataUr) {
        this.imie = imie;
        this.dataUr = dataUr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SHCPerson)) return false;
        SHCPerson person = (SHCPerson) o;
        return Objects.equals(imie, person.imie) &&
                Objects.equals(dataUr, person.dataUr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, dataUr);
    }

    @Override
    public String toString() {
        return "SHCPerson{" +
                "imie='" + imie + '\'' +
                ", dataUr=" + dataUr.toString() +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalDate getDataUr() {
        return dataUr;
    }

    public void setDataUr(LocalDate dataUr) {
        this.dataUr = dataUr;
    }
}