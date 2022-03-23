/*12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
  fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
  Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
  101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.  */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio12 {
	public void run() {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o numero de copos a serem comprados: \n");
			int n = input.nextInt();
			
			
			if(n <= 100 ) {
				System.out.println("\nPreço total: "+ n*0.05);
			}if(n > 101 && n <500) {
				System.out.println("\nPreço total: "+ n*0.04 );
			}if(n > 500) {
				System.out.println("\nPreço total: "+ n*0.035 );
			}
		}
	}
}
