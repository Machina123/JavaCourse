package net.machina.InheritanceDemo.people;

import java.time.LocalDate;

public class Person {
    private String fullName;
    private LocalDate birthDate;

    public Person(String fullName, LocalDate birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }
}
