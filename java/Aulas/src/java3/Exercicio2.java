package java3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int contadorPar=0, contadorImpar=0;
		double numero;
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0; x<10; x++) {
			System.out.print("Escreva um n�mero qualquer: ");
			numero = ler.nextDouble();
			
			if(numero%2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}
		}
		System.out.printf("Voc� digitou %d n�meros �mpares e %d pares",contadorImpar,contadorPar);
	}
}


//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)