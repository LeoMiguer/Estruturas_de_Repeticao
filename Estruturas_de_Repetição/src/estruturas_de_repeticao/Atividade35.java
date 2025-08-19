package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, maior, menor, soma, contador;

        System.out.println("Digite números positivos (0 para parar): ");
        numero = sc.nextInt();

        if(numero == 0){
            System.out.println("Nenhum número digitado.");
        } else {
            maior = numero;
            menor = numero;
            soma = numero;
            contador = 1;

            while(true){
                numero = sc.nextInt();
                if(numero == 0){
                    break;
                }
                if(numero > maior){
                    maior = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
                soma = soma + numero;
                contador = contador + 1;
            }

            double media = (double) soma / contador;
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média: " + media);
        }

        sc.close();
    }
}
