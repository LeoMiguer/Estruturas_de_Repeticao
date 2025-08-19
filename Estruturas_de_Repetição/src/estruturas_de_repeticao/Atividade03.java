package estruturas_de_repeticao;

import java.util.*;

public class Atividade03 {

	public static void main(String[]args) {
	
		String nome;
		int idade;
		float salario;
		String sexo;
		String estado_civil;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.print("Digite o nome: ");
		nome = scanner.next();
		System.out.print("Digite a idade: ");
		idade = scanner.nextInt();
		System.out.print("Digite o salário: ");
		salario = scanner.nextFloat();
		System.out.print("Digite o sexo (m/f): ");
		sexo = scanner.next();
		System.out.print("Estado Civil (s,c,v,d): ");
		estado_civil = scanner.next();
		}while((nome.length()<=3) || 
				((idade > 150) || (idade < 0)) ||
				(salario < 0) ||
				((!sexo.equalsIgnoreCase("f")) && (!sexo.equalsIgnoreCase("m"))) ||
				((!estado_civil.equalsIgnoreCase("s")) && (!estado_civil.equalsIgnoreCase("c")) && (!estado_civil.equalsIgnoreCase("v")) && (!estado_civil.equalsIgnoreCase("d")))
				);
		
	}
}
