package net.machina.StringManip;

public class StringFormat {
    public static void main(String[] args) {
        // działa jak printf z C/C++
        System.out.printf("%+,010d\n", 100000);
        System.out.printf("%1$d %1$o %1$x\n", 10);
        System.out.printf("%06.3f", Math.PI);
    }
}
