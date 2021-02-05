package java7;

import java.util.Scanner;

public class ObjetoAnimal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Escolha o animal para saber as informações:\n1-Cachorro\n2-Cavalo\n3-Preguiça");
		int opcao = ler.nextInt();
		
		if(opcao == 1) {
			System.out.println("Qual o nome do cachorro?");
			String nome = ler.next();
			System.out.println("Qual a idade do cachorro?");
			int idade = ler.nextInt();
			
			Animal info = new Cachorro(nome, idade);
			Cachorro infoC = new Cachorro(nome, idade);
			System.out.println("NOME\tIDADE\tMOVIMENTO\tSOM");
			System.out.println(info.getNome()+"\t"+info.getIdade()+"\t"+info.movimento()+"\t\t"+infoC.som());
		}
		else if(opcao == 2) {
			System.out.println("Qual o nome do cavalo?");
			String nome = ler.next();
			System.out.println("Qual a idade do cavalo?");
			int idade = ler.nextInt();
			
			Animal info = new Cavalo(nome, idade);
			Cavalo infoC = new Cavalo(nome, idade);
			System.out.println("NOME\tIDADE\tMOVIMENTO\tSOM");
			System.out.println(info.getNome()+"\t"+info.getIdade()+"\t"+info.movimento()+"\t\t"+infoC.somCavalo());
		}
		else if(opcao == 3) {
			System.out.println("Qual o nome da preguiça?");
			String nome = ler.next();
			System.out.println("Qual a idade da preguiça?");
			int idade = ler.nextInt();
			
			Preguiça info = new Preguiça(nome, idade);
			System.out.println("NOME\tIDADE\tMOVIMENTO\t\tSOM");
			System.out.println(info.getNome()+"\t"+info.getIdade()+"\t"+info.arvore()+"\t"+info.somPreguica());
		}
	}
}
