package java4;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		double maiorValor = 0;
		double valor[] = new double[5];
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.printf("Digite a "+(i+1)+"º pontuação ");
			valor[i] = ler.nextDouble();
			if(valor[i]>maiorValor) {
				maiorValor=valor[i];
			}
		}
		System.out.print("\n");
		for(int x=0; x<5; x++) {
			System.out.printf("A "+(x+1)+"º pontuação vale "+valor[x]+"\n");
		}
		System.out.print("\n");
		System.out.print("A maior pontuação é "+maiorValor);
	} 

}