package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, i;
        double valor, soma, media;

        System.out.print("Quantos CDs possui? ");
        quantidade = sc.nextInt();

        soma = 0;
        i = 1;
        while(i <= quantidade){
            System.out.print("Valor do CD " + i + ": ");
            valor = sc.nextDouble();
            soma = soma + valor;
            i = i + 1;
        }

        media = soma / quantidade;

        System.out.println("Valor total investido: R$ " + soma);
        System.out.println("Valor médio por CD: R$ " + media);

        sc.close();
    }
}
