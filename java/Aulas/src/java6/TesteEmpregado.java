package java6;

import java.util.Scanner;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado info = new Empregado("Maria", "rua 12", "(11)988452495", 22, 1010.80, 7);
		Scanner ler = new Scanner (System.in);
		int opcao;
		
		System.out.printf("Olá %s verifique suas informações por favor: \nNOME: %s\nENDEREÇO: %s\nTELEFONE: %s\n",info.getNome(),info.getNome(),info.getEndereco(),info.getTelefone());
		info.calcularSalario(0);
		
	
		
		
	}
}
