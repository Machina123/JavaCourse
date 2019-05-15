package net.machina.collections.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileToMap {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        try(Scanner s = new Scanner(new File("osoby.dat"))) {
            while(s.hasNextLine()) {
                String linia = s.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(linia);
                String id = tokenizer.nextToken();
                String im = tokenizer.nextToken();
                String na = tokenizer.nextToken();
                Person p = new Person(im, na);
                personMap.put(id, p);
            }

            for(String key : personMap.keySet())
                System.out.printf("%s -> %s\n", key, personMap.get(key).toString());

            personMap.keySet().forEach(System.out::println); // referencja do metody
            personMap.values().forEach(System.out::println);
            System.out.println("------------------------");
            System.out.println(personMap.get("765")); // pobieranie wartości o konkretnym kluczu
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}

class Person {
    private String im, na;

    public Person(String im, String na) {
        super();
        this.im = im;
        this.na = na;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(im, person.im) &&
                Objects.equals(na, person.na);
    }

    @Override
    public int hashCode() {
        return Objects.hash(im, na);
    }

    @Override
    public String toString() {
        return "Person{" +
                "im='" + im + '\'' +
                ", na='" + na + '\'' +
                '}';
    }
}
