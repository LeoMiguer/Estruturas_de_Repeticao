package estruturas_de_repeticao;

import java.util.*;

public class Atividade12 {

	public static void main(String[]args) {
			
		int numero;
		int x, y;
		boolean parar = false;
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sequencia de Fibonacci até: ");
		numero = scanner.nextInt();
		x = 0;
		y = 1;
		
		while(parar == false) {
			
			if(!(x+y > numero)) {
				x = x+y;
				System.out.print(x +", ");
			}
			else {parar = true;}
			if(!(x+y > numero)) {
				y = x+y;
				System.out.print(y +", ");
			}
			else {parar = true;}
		}
	
	}
}
