/*	11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo
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
				System.out.println("\nO numero "+ numA + " � multiplo de "+numB);
			}else {
				System.out.println("\nO numero "+ numA + " n�o � multiplo de "+numB);
			}
			if (numB%numA==0){
				System.out.println("\nO numero "+ numB + " � multiplo de "+numA);
			}else {
				System.out.println("\nO numero "+ numB + " n�o � multiplo de "+numA);
				}
		}
	}

}
