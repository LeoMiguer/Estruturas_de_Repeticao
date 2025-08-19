package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'A','B','C','D','E','E','D','C','B','A'};
        int acertos, maior = -1, menor = 11, totalAlunos = 0;
        double somaNotas = 0;
        char[] respostas = new char[10];
        String continuar;

        do {
            System.out.println("Responda a prova de 10 questões:");
            for(int i = 0; i < 10; i++){
                System.out.print("Questão " + (i+1) + ": ");
                respostas[i] = sc.next().toUpperCase().charAt(0);
            }

            acertos = 0;
            for(int i = 0; i < 10; i++){
                if(respostas[i] == gabarito[i]){
                    acertos = acertos + 1;
                }
            }

            System.out.println("Total de acertos: " + acertos);
            totalAlunos = totalAlunos + 1;
            somaNotas = somaNotas + acertos;

            if(acertos > maior){
                maior = acertos;
            }
            if(acertos < menor){
                menor = acertos;
            }

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            continuar = sc.next();

        } while(continuar.equalsIgnoreCase("S"));

        if(totalAlunos > 0){
            double media = somaNotas / totalAlunos;
            System.out.println("Maior acerto: " + maior);
            System.out.println("Menor acerto: " + menor);
            System.out.println("Total de alunos: " + totalAlunos);
            System.out.println("Média das notas da turma: " + media);
        } else {
            System.out.println("Nenhum aluno utilizou o sistema.");
        }

        sc.close();
    }
}
