package exerciciosLogica;

import java.util.Scanner;

/*
2. 	Escreva um programa que leia um numero real fornecido pelo usuario, 
	armazenando-o numa variavel apropriada.
	Imprima o valor lido.
*/
public class Exercicio02 {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		System.out.println("O valor lido foi: " + valor);		
	}
	
}
