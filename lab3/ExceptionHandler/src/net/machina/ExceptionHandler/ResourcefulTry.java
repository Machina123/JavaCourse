package net.machina.ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourcefulTry {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("input.dat"))) {
            while(sc.hasNextLine()) System.out.println(sc.nextLine());
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
