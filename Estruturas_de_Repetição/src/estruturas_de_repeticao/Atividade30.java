package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, fatorial;

        System.out.print("Digite um número para calcular o fatorial e mostrar o processo: ");
        numero = sc.nextInt();

        fatorial = 1;
        System.out.print(numero + "! = ");
        i = numero;
        while(i >= 1){
            fatorial = fatorial * i;
            if(i != 1){
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = ");
            }
            i = i - 1;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
