/*	20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em p�s
	(1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o usu�rio forne�a um valor negativo, deve ser exibida
	uma mensagem e a opera��o de convers�o n�o deve ser efetuada. */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio20 {

	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite um valor (m): \n");
			float m = input.nextFloat();
			
			float p = m *3315;
			
			if(m < 0) {
				System.out.print("Operacao nao pode ser concluida. \n");
			}else {
				System.out.println("O valor em Pes e igual a "+ p);
			}
		}
		
	}
}
