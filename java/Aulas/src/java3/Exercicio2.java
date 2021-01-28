package java3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int contadorPar=0, contadorImpar=0;
		double numero;
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0; x<10; x++) {
			System.out.print("Escreva um número qualquer: ");
			numero = ler.nextDouble();
			
			if(numero%2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}
		}
		System.out.printf("Você digitou %d números ímpares e %d pares",contadorImpar,contadorPar);
	}
}


//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)