/*	24. Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo usu�rio.
	a) Usando enquanto (while)
	b) Usando fa�a-enquanto (do-while)
	c) Usando para (for)
	Obs. Caso o valor dado seja inv�lido o programa deve apenas exibir uma mensagem de aviso. */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio24 {

	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite um numero inteiro entre 1 e 20: ");
			int num = input.nextInt();
			int i= 1;
			
			if((num <= 20) && (num > 0) ) {
				System.out.println("\n");
				
				for(i=1; i<=10; i++){
					System.out.println(num+" X "+ i +": "+(num*i));
				}
				
				i=1;
				
				System.out.println("\n");

				while(i <= 10) {
					System.out.println(num+" X "+ i +": "+(num*i));
					i++;
				}
				
				i=1;
				System.out.println("\n");

				do {
					System.out.println(num+" X "+ i +": "+(num*i));
					i++;
				}while(i <= 10);
			}else {
				System.out.println("Operao invlida!");
			}
		}
	}
}

