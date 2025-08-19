package estruturas_de_repeticao;
import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, i;
        double preco, soma;

        System.out.print("Quantos produtos deseja cadastrar? ");
        quantidade = sc.nextInt();

        soma = 0;
        i = 1;
        while(i <= quantidade){
            System.out.print("Preço do produto " + i + ": R$ ");
            preco = sc.nextDouble();
            soma = soma + preco;
            i = i + 1;
        }

        System.out.println("Total gasto na compra: R$ " + soma);

        sc.close();
    }
}
