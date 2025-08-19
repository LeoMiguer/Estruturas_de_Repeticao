package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votantes, voto, i;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        System.out.print("Número total de votantes: ");
        votantes = sc.nextInt();

        i = 1;
        while(i <= votantes){
            System.out.print("Digite o voto do eleitor " + i + " (1, 2 ou 3): ");
            voto = sc.nextInt();

            if(voto == 1){
                candidato1 = candidato1 + 1;
            } else if(voto == 2){
                candidato2 = candidato2 + 1;
            } else if(voto == 3){
                candidato3 = candidato3 + 1;
            } else {
                System.out.println("Voto inválido!");
            }
            i = i + 1;
        }

        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");

        sc.close();
    }
}
