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
			System.out.printf("M�dia dos m�ltiplos de 3 � igual a %.2f", mediaNumero);	
		} 
		else{
			System.out.println("Nenhum n�mero m�ltiplo de 3 foi informado, ent�o n�o temos uma m�dia!");
		}
	}

}



//Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)