package net.machina.SecondProjL1;

public class Main {

    public static void main(String[] args) {
//	    final double a = 10;
//	    final double b = 4;
//	    final double c = 2;

        double a=0, b=0, c=0;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

		double delta = Math.pow(b,2)-4*a*c;

		if(delta < 0) {
			System.out.println("Brak pierwiastków");
		} else {
			double sqrtdelta = Math.sqrt(delta);

			if(delta  > 0) {
				System.out.println("x1 = " + (-b-sqrtdelta)/(2*a));

//				System.out.println("x1 = " + Double.toString((-b-sqrtdelta)/(2*a)));
//				(coś takiego robi kompilator) -- Autoboxing

				System.out.println("x2 = " + (-b+sqrtdelta)/(2*a));
			} else {
				System.out.println("x0 = " + (-b)/(2*a));
			}
		}
    }
}
