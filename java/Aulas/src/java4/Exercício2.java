package java4;

import java.util.Random;
import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		final int TAMANHO=10;
		int valor[] = new int[TAMANHO], maiorValor=0, contador=0;
		double media=0, total=0;
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<TAMANHO; i++) {
			//System.out.println("Informe o valor mostrado no dado no "+(i+1)+"º lançamento: ");
			/*valor[i] = ler.nextInt();*/
			valor[i] = gerador.nextInt(7);
			total += valor[i];
			media = total/TAMANHO;
			if (valor[i]>maiorValor)
			{
				contador = 0;
				maiorValor = valor[i];
			}
			if (valor[i]==maiorValor)
			{
				contador++;
			}
		}
			for(int x=0; x<TAMANHO; x++) {
				System.out.print("O "+(x+1)+"º lançamento apareceu "+valor[x]+"\n");
			}
			System.out.print("\nA média é "+media+"\n");
			System.out.print("\nO maior valor é "+maiorValor+" e ele aparece "+contador+" vezes");
		}
	}

