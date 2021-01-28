import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		int contador=0, soma=0, numero=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		do {
			contador++;
			//perfumaria
			if (contador <=1)
			{
				System.out.print(contador);
			}
			else {
				System.out.print("+"+contador);
			}
			//uX
			soma+=contador;

			
		}while(contador<numero);
		System.out.print(" = "+soma);
	}
}

/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.*/
