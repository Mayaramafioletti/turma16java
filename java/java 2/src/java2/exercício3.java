package java2;

import java.util.Scanner;

public class exerc�cio3 {
	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Voc� est� na categoria infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Voc� est� na categoria juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Voc� est� na categoria adulto");
		}
		else {
			System.out.println("Desculpe! N�o temos categoria para sua idade");
		}
		
	}
}

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/