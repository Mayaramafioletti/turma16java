package java5;

import java.util.Scanner;

public class ClienteObjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente info = new Cliente();
		
		System.out.println("Informe seu nome: ");
		info.nome = ler.nextLine();	//Para ler o nome completo
		System.out.println("Informe sua idade: ");
		info.idade = ler.nextInt();
		System.out.println("Informe o gen�ro que voc� se identifica: F-feminino ou M-masculino");
		info.genero = ler.next().toUpperCase().charAt(0);
		
		System.out.printf("Ol� %s%s sua idade � %d anos, ent�o %s",info.genero(),info.nome,info.idade,info.statusIdade());
							
	}
}

/*Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e
 *  apresente as informa��es deste objeto no console.*/
