package exercicios;

import java.util.Scanner;

public class ChecarSenha {
	public static void main(String[] args) {
    
    //entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a sua senha: ");
		String senha = teclado.next();
    
    //processamento
		if (senha.length() < 6) {
    //saída
			System.out.println( 6 - senha.length());
		}
	}
	
}
