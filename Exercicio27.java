/*27. Calcule a m�dia de Notas de alunos. O programa deve parar de ler valores quando for
 fornecido um valor negativo como nota*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio27 {

	public void run() {
		float n=0, media=0, notas=0,i=0;

		try (Scanner input = new Scanner(System.in)) {
			do {
			System.out.print("Digite as notas para calcular a media do aluno(a). "
			+ "Quando terminar de inserir as notas, digite um numero negativo. ");
			n = input.nextFloat();
			i++;
			
			if(n >= 0) {
				notas = n+notas;
			}
			
			}while(n >= 0);
		}
		
		media = (notas/(i-1));
		
		System.out.print("\nMedia: "+media);	
	}
}
