package java2;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe tr�s n�meros inteiros ");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		numero3 = ler.nextInt();
		
		if(numero1>numero2 && numero1>numero3) {
			System.out.printf("O %d � o maior n�mero",numero1);
		}
		
		else if(numero2>numero3 && numero2>numero1) {
			System.out.printf("O %d � o maior n�mero",numero2);
		}
		else if(numero3>numero2 && numero3>numero1) {
			System.out.printf("O %d � o maior n�mero",numero3);
		}
	}
}

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
