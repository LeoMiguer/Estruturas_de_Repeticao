package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, fatorial;

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = sc.nextInt();

        fatorial = 1;
        i = 1;
        while(i <= numero){
            fatorial = fatorial * i;
            i = i + 1;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        sc.close();
    }
}
