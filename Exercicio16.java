/*	16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
	sabendo que o cálculo da área é dado por:*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio16 {
	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Base: \n");
			float b = input.nextFloat();
			
			System.out.print("Altura: \n");
			float h = input.nextFloat();
			
			float a = (b*h)/2;
			
			System.out.print("Area e igual a: "+a);
		}

		
	}
}
