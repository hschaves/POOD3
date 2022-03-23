/*30. Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio30 {

	public void run() {
			
			try (Scanner input = new Scanner(System.in)) {
				System.out.print("Digite um valor para a: ");
				int a = input.nextInt() ;
				
				System.out.print("Digite um valor para b: ");
				int b = input.nextInt() ;
				
				System.out.print("Digite um valor minimo para x: ");
				int Xmin = input.nextInt() ;
				
				System.out.print("Digite um valor maximo para x: ");
				int Xmax = input.nextInt() ;
				
				System.out.print("Digite um valor para o incremento de x: ");
				int Xinc = input.nextInt();
				
				for ( int x = Xmin; x <= Xmax; x += Xinc ) {
					System.out.println( " y = f(x) = a*x + b = "+ a + "*" + x + " + " + b + " = " + (a*x+b));
				}
			}
			
		}
}

