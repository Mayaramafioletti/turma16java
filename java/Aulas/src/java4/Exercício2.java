package java4;

import java.util.Random;
import java.util.Scanner;

public class Exerc�cio2 {
	public static void main(String[] args) {
		final int TAMANHO=10;
		int valor[] = new int[TAMANHO], maiorValor=0, contador=0;
		double media=0, total=0;
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<TAMANHO; i++) {
			//System.out.println("Informe o valor mostrado no dado no "+(i+1)+"� lan�amento: ");
			/*valor[i] = ler.nextInt();*/
			valor[i] = gerador.nextInt(7);
			total += valor[i];
			media = total/TAMANHO;
			if(valor[i]>=maiorValor) {
				if(maiorValor == valor[i]) {
					contador++;
				}
				else {
					contador=1;
				}
			}
		}
			for(int x=0; x<TAMANHO; x++) {
				System.out.println("O "+(x+1)+"� lan�amento apareceu "+valor[x]+"\n");
			}
			System.out.println("A m�dia � "+media+"\n");
			System.out.println("O maior valor � "+maiorValor+" e ele aparece"+contador+" vezes");
		}
	}

