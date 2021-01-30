package java4;

import java.util.Random;

public class Exercício4 {
	public static void main(String[] args) {
		final int TAMANHO = 3;
		int cubo[][]= new int[TAMANHO][TAMANHO];
		int soma=0;
		Random gerador = new Random();
		
		for(int linha=0;linha<TAMANHO;linha++){
			for(int coluna=0;coluna<TAMANHO;coluna++){
				cubo[linha][coluna] = gerador.nextInt(10);
				if(linha==coluna){
					soma+=cubo[linha][coluna];
				}
				System.out.println(cubo[linha][coluna]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("A soma da diagonal principal é "+ soma);
	}
}
