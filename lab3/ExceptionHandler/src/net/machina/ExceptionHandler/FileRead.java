package net.machina.ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileRead {

    public static void main(String[] args) {
        try {
            readFile("ludzie.dat");
        } catch (InvalidDataProvidedException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void readFile(String location) throws InvalidDataProvidedException {
        try (Scanner s = new Scanner(new File(location))) {
            while(s.hasNextLine()) {
                String data = s.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(data);
                try {
                    String imie = tokenizer.nextToken();
                    String nazwisko = tokenizer.nextToken();
                    int rok = Integer.parseInt(tokenizer.nextToken());
                    System.out.println(imie + " " + nazwisko + " " + rok);
                } catch(NoSuchElementException nsee) {
                    throw new InvalidDataProvidedException();
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

}

class InvalidDataProvidedException extends Exception {
    public InvalidDataProvidedException() {
        super("Błędne dane w pliku");
    }
}