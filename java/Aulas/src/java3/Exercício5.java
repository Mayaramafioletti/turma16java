package java3;

import java.util.Scanner;

public class Exercício5 {
	public static void main(String[] args) {
	int numero, soma=0;
	Scanner ler = new Scanner (System.in);
		do {
			System.out.println("Informe um número");
			numero = ler.nextInt();
			soma += numero;
		}while(numero != 0);
		System.out.println("A soma dos números é "+soma);
	}
}


/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)*/
