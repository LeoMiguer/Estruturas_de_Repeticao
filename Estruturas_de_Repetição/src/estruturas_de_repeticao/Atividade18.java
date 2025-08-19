package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, divisores;
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        divisores = 0;
        i = 1;
        System.out.print("Divisores: ");
        while(i <= numero){
            if(numero % i == 0){
                divisores = divisores + 1;
                System.out.print(i + " ");
            }
            i = i + 1;
        }
        System.out.println();

        if(divisores == 2){
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();
    }
}
