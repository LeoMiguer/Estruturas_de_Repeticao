package estruturas_de_repeticao;

import java.util.*;

public class Atividade01 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		int x = -1;
		
		do {
			System.out.print("Digite um número de 1 a 10: ");
			x = scanner.nextInt();
		}while((x<0)||(x>10));
		
	}
	
}
