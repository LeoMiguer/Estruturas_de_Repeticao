package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, n, i, divisores, totalDivisoes;
        System.out.print("Digite N: ");
        N = sc.nextInt();

        totalDivisoes = 0;
        n = 2;
        while(n <= N){
            divisores = 0;
            i = 1;
            while(i <= n){
                totalDivisoes = totalDivisoes + 1;
                if(n % i == 0){
                    divisores = divisores + 1;
                }
                i = i + 1;
            }
            if(divisores == 2){
                System.out.println(n + " é primo.");
            }
            n = n + 1;
        }

        System.out.println("Número total de divisões: " + totalDivisoes);

        sc.close();
    }
}
