package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, idade, soma, i;
        double media;

        System.out.print("Quantas pessoas na turma? ");
        quantidade = sc.nextInt();

        soma = 0;
        i = 1;
        while(i <= quantidade){
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = sc.nextInt();
            soma = soma + idade;
            i = i + 1;
        }

        media = (double) soma / quantidade;

        if(media >= 0 && media <= 25){
            System.out.println("Turma Jovem. Média: " + media);
        } else if(media <= 60){
            System.out.println("Turma Adulta. Média: " + media);
        } else {
            System.out.println("Turma Idosa. Média: " + media);
        }

        sc.close();
    }
}
