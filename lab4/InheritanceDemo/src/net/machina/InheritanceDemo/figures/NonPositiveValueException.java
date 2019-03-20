package net.machina.InheritanceDemo.figures;

public class NonPositiveValueException extends Exception {
    public NonPositiveValueException() {
        super("Wprowadzono niedodatnią wartość");
    }
}
