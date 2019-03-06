package net.machina.StringManip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        // wyświetlanie katalogu z którego uruchomione jest JVM
        System.out.println(System.getProperty("user.dir"));
        try {
            // otwieranie pliku do odczytu (sposób podstawowy)
            File infile = new File("pliczek.dat");
            Scanner sc = new Scanner(infile);

            // otwieranie pliku do zapisu (sposób podstawowy)
            File outfile = new File("output.dat");
            PrintWriter writer = new PrintWriter(outfile);

            while (sc.hasNextLine()) {
                String l = sc.nextLine();
                if (l.contains("ala")) {
                    //System.out.println(l);
                    writer.println(l);
                }
            }

            // opróżnienie bufora = zapis do pliku
            writer.flush();

            // zamykanie zasobów Scannera i PrintWritera (ta metoda nie jest niezawodna!)
            // działa jak nie zajdzie żaden wyjątek
            sc.close();
            writer.close();
        } catch(FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }
    }
}
