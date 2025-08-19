package estruturas_de_repeticao;

import java.util.*;

public class Atividade13 {

	public static void main(String[]args) {
		
		//FATORIAL
		Scanner scanner = new Scanner (System.in);
		
		int numero, x, multiplicacao = 0, soma = 0;
		
		System.out.println("Digite um número para saber seu fatorial: ");
		numero = scanner.nextInt();
		
		for(x = (numero - 1); x != 0; x--) {
			if (x == (numero - 1)) {
				multiplicacao = numero * x;
				}
			else {
				multiplicacao = multiplicacao * x;
			}
		}
		
		System.out.println("O Fatorial de "+ numero +" é "+ multiplicacao);
		
	}
	
}
