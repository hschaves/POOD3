/*	13. Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
	medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
	triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
	(três lados iguais). */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio13 {
	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o valor A: \n");
			float a = input.nextFloat();
			
			System.out.print("Digite o valor B: \n");
			float b = input.nextFloat();
			
			System.out.print("Digite o valor C: \n");
			float c = input.nextFloat();
			
			if( a < b+c && b < a+c && c < a+b) {
				String t;
				
				if((a==b)&& (b==c)&&(c==a)) {
					t = "equilatero";
				}
				if((a==b)!= (b==c)!=(c==a)) {
					t = "escaleno";
				}
				else {
					t = "isoceles";
				}
				System.out.print("\nE um triangulo " + t);
				
			}else {
				System.out.print("\nNão e um triangulo.");
			
			}
		}
	}

}
