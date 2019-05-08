package net.machina.collections.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PeopleSet {
    public static void main(String[] args) {
        Set<Person> zbiorLudzi = new HashSet<>();
        zbiorLudzi.add(new Person("Jan", "Kowalski"));
        zbiorLudzi.add(new Person("Zbigniew", "Nowak"));
        zbiorLudzi.add(new Person("Cecylia", "Banach"));

        for(Person p : zbiorLudzi) System.out.println(p.toString());

        if(zbiorLudzi.add(new Person("Cecylia", "Banach")))
            System.out.println("\nDodano obiekt");
        else System.out.println("\nTaki obiekt juz istnieje!");

        for(Person p : zbiorLudzi) System.out.println(p.toString());
    }
}

class Person {
    private String imie, nazwisko;

    public Person(String imie, String nazwisko) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return imie.equals(person.imie) &&
                nazwisko.equals(person.nazwisko);
    }

}