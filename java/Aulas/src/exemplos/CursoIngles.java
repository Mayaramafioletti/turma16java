package exemplos;

import java.util.Scanner;

import entidades.Pessoas;

public class CursoIngles {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoas info = new Pessoas();
		
		
		System.out.println("Bem vinde ao curso de Ingl�s da Mayara!");
		System.out.println("Qual � seu nome?");
		info.nome = ler.next();
		System.out.println("Qual � seu ano de nascimento?");
		info.anoNascimento = ler.nextInt();
		System.out.println("Qual � o g�nero que voc� se identifica F-feminino ou M-masculino?");
		info.sexo = ler.next().toUpperCase().charAt(0);
		
		System.out.printf("Ol� %s%s voc� tem %d anos, %s",info.genero(),info.nome,info.idade(),info.statusIdade());
		
	}
}
