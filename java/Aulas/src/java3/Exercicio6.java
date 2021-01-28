package java3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero=0;
		double soma=0.00, contador=0.00, mediaNumero=0.00;
		
		do {
			System.out.print("Digite um numero inteiro positivo: ");
			numero = ler.nextInt();
			if ((numero%3) == 0 && numero != 0 )
			{
				soma = soma+numero;
				contador++;
			}
			
		} while (numero != 0);
		if (contador!=0){
			mediaNumero = soma / contador;
			System.out.printf("Média dos múltiplos de 3 é igual a %.2f", mediaNumero);	
		} 
		else{
			System.out.println("Nenhum número múltiplo de 3 foi informado, então não temos uma média!");
		}
	}

}



//Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)