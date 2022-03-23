/*	23. Escreva um programa que receba as seguintes informa��es: um valor real indicando capital inicial PV, um valor real que
	corresponde a taxa de juros da aplica��o J e um n�mero inteiro de per�odos da aplica��o N. O programa deve retornar o
	capital futuro FV dado pela rela��o abaixo:
	FV = PV * ( 1 + J )N*/


package exerciciosLogica;

import java.util.Scanner;
import java.math.*;

public class Exercicio23 {

	public void run() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite um valor para o capital inicial: \n");
			float PV = input.nextFloat();
			System.out.print("Digite a taxa de juros: \n");
			float J = input.nextFloat();
			System.out.print("Digite quantos periodos de aplicacao: \n");
			int N = input.nextInt();
			double FV = PV * Math.pow(( 1 + J ),N);
			
			System.out.println("Depois de passado "+ N +" Meses o capital futuro ser: "+FV);
		}
		
		}
	}
