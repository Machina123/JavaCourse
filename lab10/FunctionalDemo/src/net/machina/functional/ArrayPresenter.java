package net.machina.functional;

public class ArrayPresenter {
    private int[] tab1, tab2;

    public ArrayPresenter(int[] tab1, int[] tab2) throws ArraySizeMismatchException {
        if(tab1.length != tab2.length) throw new ArraySizeMismatchException();
        this.tab1 = tab1;
        this.tab2 = tab2;
    }

    public void present(IManipInt in) {
        for(int i = 0; i < tab1.length; i++)
            System.out.println(in.manipulate(tab1[i], tab2[i]));
    }
}


class ArraySizeMismatchException extends Exception {
    public ArraySizeMismatchException() {
        super("Tablice są różnych rozmiarów!");
    }
}