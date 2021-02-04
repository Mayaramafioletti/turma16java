package Fevereiro4;

import java.util.Scanner;

public class CADFUN {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua matrícula: ");
		int matricula = ler.nextInt();
		System.out.println("Informe seu nome: ");
		String nome = ler.next();
		System.out.println("Quantas horas de trabalho: ");
		int horas = ler.nextInt();
		System.out.println("Qual é o valor da hora trabalhada: ");
		double valorHora = ler.nextDouble();
		System.out.println("Você é terceiro: [S/N]");
		char opcao = ler.next().toUpperCase().charAt(0);
				
			if(opcao == 'S') {
				System.out.println("Qual é a porcentagem do acrescimo?");
				double acrescimo = ler.nextDouble();
				Empregado info = new Terceiro(nome, matricula, horas, valorHora, acrescimo);
				info.salario();
				System.out.printf("Olá %s, você é tercerizado, sua matrícula é %d , você trabalhou %d horas então seu salário é %.2f",info.getNome(),info.getMatricula(),info.getHoras(),info.salario() );
			}
			else if (opcao == 'N') {
				Empregado info = new Empregado(nome, matricula, horas, valorHora);
				info.salario();
				System.out.printf("Olá %s, sua matrícula é %d , você trabalhou %d horas então seu salário é %.2f",info.getNome(),info.getMatricula(),info.getHoras(),info.salario());
			}
			
		
		
	}
}
