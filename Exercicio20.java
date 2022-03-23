/*	20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
	(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
	uma mensagem e a operação de conversão não deve ser efetuada. */

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
