package exerciciosLogica;

import java.util.Scanner;

/*
3. Leia um numero qualquer fornecido pelo usuario. Determine se o numero e maior do que 50, 
imprimindo uma mensagem indicando tal fato.
*/
public class Exercicio03 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor > 50){
			System.out.println("O valor lido " + valor + " e maior que 50!");
		}
	}
}
