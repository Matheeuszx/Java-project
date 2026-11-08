import java.util.Scanner;

public class ex3_condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        System.out.println("Digite o primeiro : ");
        A = sc.nextInt();
        System.out.println("Digite o segundo : ");
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }


    }
}
