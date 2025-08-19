package estruturas_de_repeticao;

import java.util.*;

public class Atividade10 {

	public static void main(String[]args) {
		
		int base;
		int expoente;
		int resultado = 1;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a base: ");
		base = scanner.nextInt();
		System.out.print("Digite o expoente: ");
		expoente = scanner.nextInt();
		
		for(int x = 0; x < expoente; x++) {
			resultado = resultado * base;
		}
		System.out.println("O resultado é: "+ resultado);
		
	}
	
}
