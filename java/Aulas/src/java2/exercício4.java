package java2;

import java.util.Scanner;

public class exerc�cio4 {
	public static void main(String[] args) {
		double numero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número inteiro ");
		numero = ler.nextInt();
			
			
		if( numero%2 == 0 && numero>0){
			
			System.out.printf("O seu número é par, e a raiz quadrada é %.2f",Math.sqrt(numero)); 
		}
		else if (numero%2 != 0 && numero>0){
		System.out.println("Seu número é impar, e o quadrado dele é "+Math.pow(numero, 2));
		}
		else if (numero < 0){
		System.out.println("Desculpa, não consigo te ajudar");
		}
		else if (numero == 0){
		System.out.println("Seu número é neutro");
		}
			
	}
		
}