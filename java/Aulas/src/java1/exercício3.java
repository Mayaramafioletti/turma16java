package java1;

import java.util.Scanner;

public class exerc�cio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo;
		
		System.out.print("Informe a dura��o do evento em segundos: ");
		tempo = ler.nextInt();
		
		System.out.println("O evento durou "+tempo/3600+" horas, "+(tempo%3600)/60+" minutos e "+ (tempo%3600)%60 +" segundos");
	}
}