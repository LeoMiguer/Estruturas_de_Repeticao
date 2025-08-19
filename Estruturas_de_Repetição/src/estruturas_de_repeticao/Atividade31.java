package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        System.out.print("Números primos até " + numero + ": ");
        for(i = 2; i <= numero; i++){
            boolean primo = true;
            int j = 2;
            while(j < i){
                if(i % j == 0){
                    primo = false;
                }
                j = j + 1;
            }
            if(primo){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
