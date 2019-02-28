package net.machina.SecondProjL1;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        double[] coeff = new double[3];
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()) {
            for(int i = 0; i < 3; i++) {
                coeff[i] = scanner.nextDouble();
            }
            double a = coeff[0], b = coeff[1], c = coeff[2];

            double delta = Math.pow(b,2)-4*a*c;
            if(delta < 0) {
                System.out.println("Brak pierwiastków");
            } else {
                double sqrtdelta = Math.sqrt(delta);
                if(delta  > 0) {
                    System.out.println("x1 = " + (-b-sqrtdelta)/(2*a));
                    System.out.println("x2 = " + (-b+sqrtdelta)/(2*a));
                } else {
                    System.out.println("x0 = " + (-b)/(2*a));
                }
            }
        }
        System.out.println("Koniec programu");
    }
}
