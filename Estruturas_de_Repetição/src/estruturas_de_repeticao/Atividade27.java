package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i;
        System.out.print("Digite um número para ver sua tabuada: ");
        numero = sc.nextInt();

        i = 1;
        while(i <= 10){
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i = i + 1;
        }

        sc.close();
    }
}
