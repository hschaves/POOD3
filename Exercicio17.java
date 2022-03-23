/*	17. Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
	usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada. */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio17 {
	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um valor em segundos: \n");
			float s = input.nextFloat();
			
			float hr = s/3600;
			
			System.out.println("total de "+hr+" Horas");

			if(s<0) {
			
				System.out.println("Operação nao pode ser efetuada");
			}
		}
	}
}
