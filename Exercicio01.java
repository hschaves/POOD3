package exerciciosLogica;

/*
1.  Escreva um programa que leia um numero inteiro fornecido pelo usuario, 
	armazenando-o numa variavel apropriada.
    Imprima o valor lido.
*/

import java.util.Scanner;

public class Exercicio01 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		System.out.println("O valor lido foi: " + valor);
		
	}

}
