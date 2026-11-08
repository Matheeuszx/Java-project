import java.util.Locale;
import java.util.Scanner;

public class ex1_Condicional {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }
}
