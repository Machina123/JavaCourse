package net.machina.collections.sets;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class DeepHashSetCopy {
    public static void main(String[] args) {
        System.out.println("--- Przed edycja zbior 1: ---");
        Set<DHCPerson> peopleSet1 = new HashSet<>();
        peopleSet1.add(new DHCPerson("Janina", LocalDate.of(2000,1,1)));
        peopleSet1.add(new DHCPerson("Grażyna", LocalDate.of(2000,1,1)));
        peopleSet1.forEach(System.out::println);
        System.out.println("--- Przed edycja zbior 2: ---");
        Set<DHCPerson> peopleSet2 = new HashSet<>();
        Iterator<DHCPerson> iter = peopleSet1.iterator();
        iter.forEachRemaining((obj) -> {
            try {
                peopleSet2.add((DHCPerson) obj.clone());
            } catch(CloneNotSupportedException cnse) {
                cnse.printStackTrace();
            }
        });
        peopleSet2.forEach(System.out::println);

        peopleSet1.iterator().forEachRemaining((obj) -> obj.setDataUr(LocalDate.of(2001,1,1)));

        System.out.println("--- Po edycji zbior 1: ---");
        peopleSet1.forEach(System.out::println);

        System.out.println("--- Po edycji zbior 2: ---");
        peopleSet2.forEach(System.out::println);
    }
}

class DHCPerson implements Cloneable {
    private String imie;
    private LocalDate dataUr;

    public DHCPerson(String imie, LocalDate dataUr) {
        this.imie = imie;
        this.dataUr = dataUr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DHCPerson)) return false;
        DHCPerson person = (DHCPerson) o;
        return Objects.equals(imie, person.imie) &&
                Objects.equals(dataUr, person.dataUr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, dataUr);
    }

    @Override
    public String toString() {
        return "DHCPerson{" +
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}