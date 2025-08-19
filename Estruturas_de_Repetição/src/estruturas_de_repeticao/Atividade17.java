package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, divisores;
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        divisores = 0;
        i = 1;
        while(i <= numero){
            if(numero % i == 0){
                divisores = divisores + 1;
            }
            i = i + 1;
        }

        if(divisores == 2){
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();
    }
}
