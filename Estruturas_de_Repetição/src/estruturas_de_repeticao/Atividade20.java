package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, i;
        double nota, soma, media;

        System.out.print("Quantas notas deseja informar? ");
        quantidade = sc.nextInt();

        soma = 0;
        i = 1;
        while(i <= quantidade){
            System.out.print("Digite a nota " + i + ": ");
            nota = sc.nextDouble();
            soma = soma + nota;
            i = i + 1;
        }

        media = soma / quantidade;
        System.out.println("Média aritmética: " + media);

        sc.close();
    }
}
