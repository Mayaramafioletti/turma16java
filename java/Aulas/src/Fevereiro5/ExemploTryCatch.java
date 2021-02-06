package Fevereiro5;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
		try{
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");
			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � "+vetor[posicao]);
		}
		/*catch(Exception e) {
			System.out.println("Voc� precisa digitar bem as informa��es");
		}*/
		
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro){
			System.out.println("Amig�o, tu digitou um tamanho de indice errado!!!");
		}
		catch(java.util.InputMismatchException erro) {
			System.out.println("Tem que ser um n�mero");
		}
		finally{
		System.out.println("Voc� precisa digitar bem as informa��es");
		}
			System.out.println("Fim de programa!!!!");
	}
}
