package Fevereiro5;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
		try{
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");
			System.out.println("Digite uma posição da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posição escolhida é "+vetor[posicao]);
		}
		/*catch(Exception e) {
			System.out.println("Você precisa digitar bem as informações");
		}*/
		
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro){
			System.out.println("Amigão, tu digitou um tamanho de indice errado!!!");
		}
		catch(java.util.InputMismatchException erro) {
			System.out.println("Tem que ser um número");
		}
		finally{
		System.out.println("Você precisa digitar bem as informações");
		}
			System.out.println("Fim de programa!!!!");
	}
}
