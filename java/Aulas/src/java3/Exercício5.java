package java3;

import java.util.Scanner;

public class Exerc�cio5 {
	public static void main(String[] args) {
	int numero, soma=0;
	Scanner ler = new Scanner (System.in);
		do {
			System.out.println("Informe um n�mero");
			numero = ler.nextInt();
			soma += numero;
		}while(numero != 0);
		System.out.println("A soma dos n�meros � "+soma);
	}
}


/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
