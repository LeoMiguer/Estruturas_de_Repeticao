package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulo = 0, branco = 0;

        System.out.println("Eleição presidencial - digite 0 para encerrar.");
        System.out.println("1- Jose | 2- João | 3- Maria | 4- Ana | 5- Nulo | 6- Branco");

        while(true){
            System.out.print("Digite o voto: ");
            voto = sc.nextInt();

            if(voto == 0){
                break;
            } else if(voto == 1){
                c1 = c1 + 1;
            } else if(voto == 2){
                c2 = c2 + 1;
            } else if(voto == 3){
                c3 = c3 + 1;
            } else if(voto == 4){
                c4 = c4 + 1;
            } else if(voto == 5){
                nulo = nulo + 1;
            } else if(voto == 6){
                branco = branco + 1;
            } else {
                System.out.println("Voto inválido!");
            }
        }

        int total = c1 + c2 + c3 + c4 + nulo + branco;

        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");
        System.out.println("Candidato 4: " + c4 + " votos");
        System.out.println("Votos nulos: " + nulo);
        System.out.println("Votos em branco: " + branco);
        if(total != 0){
            System.out.println("Percentual de nulos: " + ((double)nulo/total*100) + "%");
            System.out.println("Percentual de brancos: " + ((double)branco/total*100) + "%");
        }

        sc.close();
    }
}
