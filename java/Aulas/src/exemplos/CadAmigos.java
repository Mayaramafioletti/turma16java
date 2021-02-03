package exemplos;

import java.util.Scanner;

import entidades.Pessoas;

public class CadAmigos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Pessoas brother1 = new Pessoas();
		
		System.out.println("Digite o nome: ");
		brother1.nome = ler.next();
		System.out.println("Digite F - feminino ou M - masculino:");
		brother1.sexo = ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		brother1.anoNascimento = ler.nextInt();
		
		System.out.printf("Oi %s, sua idade aproximada é %d anos!!", brother1.nome, brother1.idade());
	}
}
