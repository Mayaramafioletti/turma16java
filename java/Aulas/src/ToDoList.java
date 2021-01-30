import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args) {
		String nome;
		String agenda [][] = new String[24][32];
		int dia, hora;
		char continuar = ' ';
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo!");
		do {
			System.out.print("\nInforme seu nome: ");
			nome = ler.next();
			do {
				System.out.print("\nInforme a data do evento (1 até 31): ");
				dia = ler.nextInt();
				if(dia<1 || dia>31) {
					System.out.print("Data incorreta. Favor informar entre as datas 1 e 31");
				}
				System.out.print("\nInforme o horário do evento [0 até 23]: ");
				hora = ler.nextInt();
				if(hora<0 || hora>24) {
					System.out.print("Horário incorreto. Favor informar entre os horário de 0 e 23");
				}
				System.out.print("\nObrigadoa! Qual evento você gostaria de adicionar? ");
				agenda[hora][dia - 1] = ler.next();
				System.out.println("Evento adicionado com sucesso!");
				System.out.println("\n\nDeseja informar um novo evento? [S/N]: ");
				continuar = ler.next().toUpperCase().charAt(0);
			}while (continuar == 'S');
			
			System.out.print("\\nGostaria de mostrar a agenda atual? [S/N]: ");
			continuar = ler.next().toUpperCase().charAt(0);
			if(continuar == 'S');{
				System.out.println("TO DO LIST - "+ nome+"\n");
				for(int linha=0 ; linha<24; linha++) {
					for(int coluna=0; coluna<31; coluna++) {
						if(agenda[linha][coluna] != null) {
							System.out.println("\n | Dia "+(coluna+1)+ " às "+(linha) + ":00 | :  "+agenda[linha][coluna] + " ");
						}
					}
				}
			}
			System.out.print("\nDeseja recomeçar? [S/N]: ");
			continuar = ler.next().toUpperCase().charAt(0);
		}while (continuar == 'S');
	}
}
	
