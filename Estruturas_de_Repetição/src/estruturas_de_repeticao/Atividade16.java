package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, numero, menor, maior, soma;

        System.out.print("Quantos números deseja informar? ");
        quantidade = sc.nextInt();

        System.out.print("Digite o 1º número: ");
        numero = sc.nextInt();

        menor = numero;
        maior = numero;
        soma = numero;

        int i = 2;
        while(i <= quantidade){
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            if(numero < menor){
                menor = numero;
            }
            if(numero > maior){
                maior = numero;
            }
            soma = soma + numero;
            i = i + 1;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
