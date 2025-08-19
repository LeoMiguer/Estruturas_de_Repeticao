package estruturas_de_repeticao;

import java.util.*;

public class Atividade15 {

	public static void main(String[]args) {
		
		int x[] = new int[37];
		int y[] = new int[37];
		int z[] = new int[37];
		int cont2 = 1;
		int soma = 0;
		
		System.out.print("S = ");
		for(int cont1 = 36; cont1 >= 0; cont1--) {
			x[cont1] = cont1 + 1;	
			y[cont1] = cont1 + 2;
			z[cont1] = cont2;
			cont2++;
			
			soma = soma + ((x[cont1]*y[cont1])/z[cont1]);
			if(cont1 == 36)
				System.out.print("("+ x[cont1] +"*"+ y[cont1] +")/"+ z[cont1]);
			else
				System.out.print(" + ("+ x[cont1] +"*"+ y[cont1] +")/"+ z[cont1]);
		}
		System.out.print(" = "+ soma);
		
	}
}
