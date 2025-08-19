package estruturas_de_repeticao;

import java.util.*;

public class Atividade04 {

	public static void main(String[]args) {
		
		double populacaoA = 80000;
		double populacaoB = 200000;
		double txA = 3.0;
		double txB = 1.5;
		
		int ano = 0;
		boolean parar = false;
		
		//Quanto tempo o Pais A demora para alcançar o pais B?
		
		while (parar == false){
			System.out.println("-------------------------------------");
			System.out.println("Ano: "+ ano);
			System.out.println("População Pais A: "+ populacaoA);
			System.out.println("População Pais B: "+ populacaoB);
			
			ano = ano + 1;
			populacaoA = populacaoA + ( (txA/100) * populacaoA);
			populacaoB = populacaoB + ( (txB/100) * populacaoB);
			
			if(populacaoA > populacaoB) {parar = true;}
		}
		
		System.out.println("O país A demorou "+ ano +" anos para alcançar o país B.");
		
		
		
		
		
		
		
		
		
	}
	
}
