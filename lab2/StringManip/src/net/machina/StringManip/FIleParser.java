package net.machina.StringManip;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FIleParser {
    public static void main(String[] args) {
        try {
            File input = new File("task_input.dat");
            File output = new File("task_output.dat");

            Scanner sc = new Scanner(input);
            PrintWriter pw = new PrintWriter(output);

            while(sc.hasNext()) {
                String next = sc.next();
                Double arg1 = Double.parseDouble(sc.next());
                Double arg2 = Double.parseDouble(sc.next());
                Double result;
                if(next.contains("sum")) {
                    result = arg1 + arg2;
                    pw.println(result);
                } else if(next.contains("sub")) {
                    result = arg1 - arg2;
                    pw.println(result);
                }
            }
            pw.flush();
            pw.close();
            sc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
