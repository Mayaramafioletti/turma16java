
package Fevereiro4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class CadFunArray {
public static void main(String[] args) {
	Locale.setDefault(Locale.UK);
	Scanner ler = new Scanner(System.in);
	List<Empregado> lista = new ArrayList<>();
	
	System.out.println("Digite o númeor de empregados: ");
	int numero = ler.nextInt();
	
	for(int x=1; x<=numero;x++ ) {
		System.out.println("Você é terceiro: [S/N]");
		char opcao = ler.next().toUpperCase().charAt(0);
		System.out.println("Informe sua matrícula: ");
		int matricula = ler.nextInt();
		System.out.println("Informe seu nome: ");
		String nome = ler.next();
		System.out.println("Quantas horas de trabalho: ");
		int horas = ler.nextInt();
		System.out.println("Qual é o valor da hora trabalhada: ");
		double valorHora = ler.nextDouble();
	
		if(opcao == 'S') {
			System.out.println("Qual é a porcentagem do acrescimo?");
			double acrescimo = ler.nextDouble();
			lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));
		
		}
		else if (opcao == 'N') {
			lista.add(new Empregado(nome, matricula, horas, valorHora));
		}
	}
	System.out.println();
	System.out.println("PAGAMENTOS: ");
	for (Empregado emp:lista) {
		System.out.println(emp.getNome()+"-$"+String.format("%.2f",emp.salario()));;
	}
}
}
