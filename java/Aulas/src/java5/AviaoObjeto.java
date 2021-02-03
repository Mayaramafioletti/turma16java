package java5;

import java.util.Scanner;

public class AviaoObjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Aviao info = new Aviao(72,79,24);

		
		System.out.println("A altura do avião é "+info.altura);
		System.out.println("O comprimento do avião é "+info.comprimento);
		System.out.println("A largura do avião é "+info.largura);
		
		System.out.println("O avião está voando?");
		info.voar = ler.next().toUpperCase().charAt(0);
		System.out.println(info.fly());
	}
	
}
