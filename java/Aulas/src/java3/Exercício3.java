package java3;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		int idade =0, contadorMenor=0, contadorMaior=0;
		Scanner ler = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			if(idade<21) {
				contadorMenor++;
			}
			else if(idade>50) {
				contadorMaior++;
			}
		}
		System.out.printf("Temos %d com menos de 21 anos e %d com mais de 50 anos",contadorMenor,contadorMaior);
	}
}

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
