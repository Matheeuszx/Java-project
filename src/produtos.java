import java.util.Locale;
import java.util.Scanner;

public class produtos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo,quantidade;
        double preco, valorTotal;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1 ){
            preco = 4.00;
        } else if (codigo == 2){
            preco = 4.50;
        } else if (codigo == 3){
            preco = 5.00;
        } else if (codigo == 4){
            preco = 2.00;
        } else if (codigo == 5){
            preco = 1.50;
        } else {
            preco = 0;


        }
        valorTotal = quantidade * preco;
        System.out.printf("Total: %.2f%n" , valorTotal);
    }
}
