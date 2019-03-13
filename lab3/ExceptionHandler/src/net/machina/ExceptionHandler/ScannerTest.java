package net.machina.ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.dat"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("Niepoprawna nazwa pliku!");
            e.printStackTrace();
        } finally {
            if(sc != null) sc.close();
        }
    }
}
