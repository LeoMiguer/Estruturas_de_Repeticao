package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int turmas, alunos, soma, i;
        double media;

        System.out.print("Quantas turmas? ");
        turmas = sc.nextInt();

        soma = 0;
        i = 1;
        while(i <= turmas){
            do {
                System.out.print("Quantidade de alunos na turma " + i + " (máximo 40): ");
                alunos = sc.nextInt();
                if(alunos > 40){
                    System.out.println("Turma não pode ter mais de 40 alunos!");
                }
            } while(alunos > 40);

            soma = soma + alunos;
            i = i + 1;
        }

        media = (double) soma / turmas;
        System.out.println("Número médio de alunos por turma: " + media);

        sc.close();
    }
}
