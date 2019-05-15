package net.machina.functional;

public class StringPresenter {
    private static String[] TAB = {"xdddddd", "qwertyuiop", "asdfghjkl", "zxcvbnm"};
    public static void present(IManipString im) {
        for(int i = 0; i < TAB.length; i++)
            System.out.println(im.manipulate(TAB[i]));
    }

    public static void main(String[] args) {
        present(x -> x);
        present(x -> x.toUpperCase());
        present(x -> x.substring(0,4).toUpperCase());
    }
}
