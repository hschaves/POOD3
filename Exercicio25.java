/* 25. Fa�a um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio.  */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio25 {

	public void run() {
		int soma =0;
		int n;
		int i=1;
		
		while(i > 0) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite um valor inteiro : \n");
			n = input.nextInt();
			soma = soma+n;
			System.out.println("Digite 1 para inserir o proximo numero ou -1 para terminar");
			i = input.nextInt();
		}
		}
		System.out.print("A soma � : "+ soma);
	}	
}
