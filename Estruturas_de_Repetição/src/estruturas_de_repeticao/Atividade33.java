package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, soma;

        System.out.print("Digite um número para verificar se é perfeito: ");
        numero = sc.nextInt();

        soma = 0;
        i = 1;
        while(i < numero){
            if(numero % i == 0){
                soma = soma + i;
            }
            i = i + 1;
        }

        if(soma == numero){
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        sc.close();
    }
}
