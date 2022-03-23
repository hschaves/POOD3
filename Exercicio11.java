/*	11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo
	de A. */


package exerciciosLogica;

import java.util.Scanner;

public class Exercicio11 {
	
	public void run() {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o numero A: \n");
			int numA = input.nextInt();
			System.out.println("Digite o numero B: \n");
			int numB = input.nextInt();
			
			if (numA%numB==0){
				System.out.println("\nO numero "+ numA + " é multiplo de "+numB);
			}else {
				System.out.println("\nO numero "+ numA + " não é multiplo de "+numB);
			}
			if (numB%numA==0){
				System.out.println("\nO numero "+ numB + " é multiplo de "+numA);
			}else {
				System.out.println("\nO numero "+ numB + " não é multiplo de "+numA);
				}
		}
	}

}
