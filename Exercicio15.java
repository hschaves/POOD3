/*	15. Escreva um programa que realize as seguintes tarefas:
	a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
	b) Realize a soma dos valores x e y, exibindo seu resultado;
	c) Realize o produto dos valores x e y exibindo seu resultado;
	d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes. */


package exerciciosLogica;

import java.util.Scanner;

public class Exercicio15 {
	public void run() {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o valor de X: ");
			int x = input.nextInt();
			System.out.print("Digite o valor de Y: ");
			int y = input.nextInt();
			
			System.out.println("A soma dos valores x e y e: "+ (x+y));
			System.out.println("o Produto dos valores x e y e: " + (x * y));
			
			if(x > y) {
				System.out.println("X>Y");
			}
			else if(x < y) {
				System.out.println("X<Y");
			}
			else {
				System.out.println("X=Y");
			}
		}
		
		
	}

}
