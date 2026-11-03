import java.util.Locale;
import java.util.Scanner;


public class EX5_Funcionario {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int horas = sc.nextInt();
        double salarioHora = sc.nextDouble();

        double salario = horas * salarioHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n",salario);

        sc.close();

    }
}