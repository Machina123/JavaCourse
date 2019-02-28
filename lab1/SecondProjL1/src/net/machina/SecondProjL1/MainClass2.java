package net.machina.SecondProjL1;

public class MainClass2 {
    public static void main(String[] args) {
        final int count = 4;
        double[][] coeff = new double[3][count];

        coeff[0][0] = 2;
        coeff[1][0] = 10;
        coeff[2][0] = 3;

        coeff[0][1] = 2;
        coeff[1][1] = 4;
        coeff[2][1] = 2;

        coeff[0][2] = 10;
        coeff[1][2] = 2;
        coeff[2][2] = 3;

        coeff[0][3] = -10;
        coeff[1][3] = 10;
        coeff[2][3] = 2;

        for(int i = 0; i < count; i++) {
            double a = coeff[0][i], b = coeff[1][i], c = coeff[2][i];
            System.out.println("a = " + a + "; b = " + b + "; c = " + c);
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
            System.out.println("-------------------------");
        }
    }
}
