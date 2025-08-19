package estruturas_de_repeticao;

import java.util.*;

public class Atividade08 {

	public static void main(String[]args) {
		
		int inicio;
		int fim;
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número inicial do intervalo:");
		inicio = scanner.nextInt();
		System.out.print("Digite o número final do intervalo:");
		fim = scanner.nextInt();
		
		for(int x = inicio; x <= fim; x++) {
			System.out.println(x);
			soma = soma + x;
		}
		System.out.println("Soma total dos números: "+ soma);
		
	}
	
}
