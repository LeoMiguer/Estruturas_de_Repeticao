package estruturas_de_repeticao;

import java.util.*;

public class Atividade02 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		
		boolean parar = false;
		String usuario, senha;
		
		while(parar == false) {
			System.out.print("Digite o usuário: ");
			usuario = scanner.next();
			System.out.print("Digite a senha: ");
			senha = scanner.next();
			
			if(usuario.equals(senha)) {
				System.out.println("Show de bola!");
				parar = true;
			}else {
				System.out.println("Usuário e senha não correspondem, insira novamente...");
			}
		}
		
	}
	
}
