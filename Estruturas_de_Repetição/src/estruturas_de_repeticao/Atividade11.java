package estruturas_de_repeticao;

import java.util.*;

public class Atividade11 {
	
	public static void main(String[]args) {
		int numero[] = new int[10];
		int par = 0, impar = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite 10 números: ");
		for(int x = 0; x < 10; x++) {
			numero[x] = scanner.nextInt();
			
			if(numero[x] % 2 == 0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}	
		}
		System.out.println("Tem "+ par +" números pares, e "+ impar +" números ímpares.");
		scanner.close();
	}

}
