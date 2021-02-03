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
		System.out.println("Informe o genêro que você se identifica: F-feminino ou M-masculino");
		info.genero = ler.next().toUpperCase().charAt(0);
		
		System.out.printf("Olá %s%s sua idade é %d anos, então %s",info.genero(),info.nome,info.idade,info.statusIdade());
							
	}
}

/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e
 *  apresente as informações deste objeto no console.*/
