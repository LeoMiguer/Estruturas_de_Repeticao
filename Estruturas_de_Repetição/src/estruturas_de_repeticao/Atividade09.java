package estruturas_de_repeticao;

import java.util.*;

public class Atividade09 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número para ver sua tabuada: ");
		int numero = scanner.nextInt();
		
		for(int x = 1; x <= 10; x++) {
			System.out.println(numero +" x "+ x +" = "+ (numero*x));
		}
			
	}
}
