package net.machina.ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DivisionCalc {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("liczby.dat"))) {
            while(true) {
                try {
                    compute(sc);
                } catch (DivisionByZeroException dbze) {
                    System.out.println(dbze.getMessage());
                    continue;
                } catch(EndOfFileException eofe) {
                    System.out.println(eofe.getMessage());
                    break;
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static double compute(Scanner sc) throws DivisionByZeroException, EndOfFileException {
        if(!sc.hasNextLine()) throw new EndOfFileException();
        String data = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(data);
        int num1 = Integer.parseInt(tokenizer.nextToken());
        int num2 = Integer.parseInt(tokenizer.nextToken());
        if(num2 == 0) throw new DivisionByZeroException();
        return (double)num1 / num2;
    }

}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Dzielenie przez zero");
    }
}

class EndOfFileException extends Exception {
    public EndOfFileException() {
        super("Koniec pliku");
    }
}
