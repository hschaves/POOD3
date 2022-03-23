/*	13. Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
	medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
	tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
	(tr�s lados iguais). */

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
				System.out.print("\nN�o e um triangulo.");
			
			}
		}
	}

}
