import java.util.Locale;

public class Main {

    public static void main(String[] args){

        int age = 21;
        double x = 568.6357;

        System.out.println(age);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Matheus";
        int idade = 21;
        double renda = 10000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);

    }

}

