package java4;

import java.util.Random;

public class Exercício3 {
	public static void main(String[] args) {
	
		final int TAMANHOLINHA=4,TAMANHOCOLUNA=6;
		int n1[][] = new int[TAMANHOLINHA][TAMANHOCOLUNA];
		int n2[][] = new int[TAMANHOLINHA][TAMANHOCOLUNA];
		int m1[][] = new int[TAMANHOLINHA][TAMANHOCOLUNA];
		int m2[][] = new int[TAMANHOLINHA][TAMANHOCOLUNA];
		int l=0,c=0;
		Random gerador = new Random();
				
		System.out.println("     N1\n\n");
		for(l=0;l<TAMANHOLINHA;l++){
			for(c=0;c<TAMANHOCOLUNA;c++){
				n1[l][c]= gerador.nextInt(10);
				System.out.print(n1[l][c]+" ");
			}
			System.out.println("\n");
		}
					
		System.out.println("\n     N2\n\n");
		for(l=0;l<TAMANHOLINHA;l++){
			for(c=0;c<TAMANHOCOLUNA;c++){
				n2[l][c]= gerador.nextInt(10);
				System.out.println(n2[l][c]+" ");
			}
			System.out.println("\n");
		}
					
		System.out.println("\n     M1\n\n");
		for(l=0;l<TAMANHOLINHA;l++){
			for(c=0;c<TAMANHOCOLUNA;c++){
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.println(m1[l][c]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("\n     M2\n\n");
		for(l=0;l<TAMANHOLINHA;l++){
			for(c=0;c<TAMANHOCOLUNA;c++){
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.println(m2[l][c]+" ");
			}
			System.out.println("\n");
		}
							
	}
	
}
	
