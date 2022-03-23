/*	14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
	"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7. */

package exerciciosLogica;

import java.util.Scanner;


public class Exercicio14 {

	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Nota 1: \n");
			float n1 = input.nextFloat();
			System.out.print("Nota 2: \n");
			float n2 = input.nextFloat();
			System.out.print("Nota 3: \n");
			float n3 = input.nextFloat();
			
			float m;
			m = (n1 + n2 + n3) / 3; 
			
			if(m>7){
				System.out.println("\nNota: "+ m);
				System.out.println("\nAprovado!\n");
				}
			 else if(m>3 && m<7) {
				System.out.println("\nNota: "+ m);
				System.out.println("\nExame!\n");
			 	}
			else if(m<3) {
				System.out.println("\nNota: "+ m);
				System.out.println("\nReprovado!\n");
				}
		}
	}

}
