package estruturas_de_repeticao;

import java.util.*;

public class Atividade07 {

	public static void main(String[]args) {
		
		int inicio;
		int fim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número inicial do intervalo:");
		inicio = scanner.nextInt();
		System.out.print("Digite o número final do intervalo:");
		fim = scanner.nextInt();
		
		for(int x = inicio; x <= fim; x++) {
			System.out.println(x);
		}
		
	}
	
}
