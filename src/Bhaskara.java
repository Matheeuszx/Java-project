import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double delta, X1 , X2;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        delta = (Math.pow(B,2)) - 4 * A * C;

        if(delta < 0.0  || A == 0 ) {
            System.out.println("Impossivel calcular");
        } else {
            X1 = (-B + Math.sqrt(delta)) / (2 * A);
            X2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n" , X1);
            System.out.printf("R2 = %.5f%n", X2);
        }

    }
}
