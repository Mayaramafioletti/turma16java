package java5;

import java.util.Scanner;

public class AviaoObjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Aviao info = new Aviao(72,79,24);

		
		System.out.println("A altura do avi�o � "+info.altura);
		System.out.println("O comprimento do avi�o � "+info.comprimento);
		System.out.println("A largura do avi�o � "+info.largura);
		
		System.out.println("O avi�o est� voando?");
		info.voar = ler.next().toUpperCase().charAt(0);
		System.out.println(info.fly());
	}
	
}
