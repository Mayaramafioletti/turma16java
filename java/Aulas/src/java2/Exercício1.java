package java2;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe três números inteiros ");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		numero3 = ler.nextInt();
		
		if(numero1>numero2 && numero1>numero3) {
			System.out.printf("O %d é o maior número",numero1);
		}
		
		else if(numero2>numero3 && numero2>numero1) {
			System.out.printf("O %d é o maior número",numero2);
		}
		else if(numero3>numero2 && numero3>numero1) {
			System.out.printf("O %d é o maior número",numero3);
		}
	}
}

//Faça um programa que receba três inteiros e diga qual deles é o maior.
