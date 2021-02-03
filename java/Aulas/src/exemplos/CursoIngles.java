package exemplos;

import java.util.Scanner;

import entidades.Pessoas;

public class CursoIngles {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoas info = new Pessoas();
		
		
		System.out.println("Bem vinde ao curso de Inglês da Mayara!");
		System.out.println("Qual é seu nome?");
		info.nome = ler.next();
		System.out.println("Qual é seu ano de nascimento?");
		info.anoNascimento = ler.nextInt();
		System.out.println("Qual é o gênero que você se identifica F-feminino ou M-masculino?");
		info.sexo = ler.next().toUpperCase().charAt(0);
		
		System.out.printf("Olá %s%s você tem %d anos, %s",info.genero(),info.nome,info.idade(),info.statusIdade());
		
	}
}
