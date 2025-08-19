package estruturas_de_repeticao;

import java.util.*;

public class Atividade14 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int n = 1, m = 1;
		
		System.out.print("Insira o valor de N: ");
		x = scanner.nextInt();
		
		System.out.print("S = ");
		for(n = 1; n != (x + 1); n = n+1) {
			System.out.print(n+"/"+m);
			m = m + 2;
			if (!(n == x)) {
				System.out.print(" + ");
			}
		}
		
	}
	
}
