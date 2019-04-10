package net.machina.swingdatamgmt;

import java.time.LocalDate;

public class Czlowiek {
    private String imie, nazwisko;
    private LocalDate dataUrodzenia;

    public Czlowiek(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
}
