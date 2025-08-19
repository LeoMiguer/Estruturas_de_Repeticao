package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, soma;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        soma = 0;
        i = 1;
        System.out.print("Divisores de " + numero + ": ");
        while(i <= numero){
            if(numero % i == 0){
                soma = soma + i;
                System.out.print(i + " ");
            }
            i = i + 1;
        }

        System.out.println("\nSoma dos divisores = " + soma);

        sc.close();
    }
}
