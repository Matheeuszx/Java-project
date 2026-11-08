import java.util.Locale;
import java.util.Scanner;

public class ex2_condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        if( num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }


    }
}
