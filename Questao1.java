package exercicios;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		// Variáveis
		int numLinhas;
		
		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o número de linhas: ");
		numLinhas = teclado.nextInt();
		
		 //Processamento
		for (int linha = 0; linha < numLinhas; linha++) {
			for (int col = 0; col < numLinhas; col++) {
				if (col < numLinhas - linha - 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
