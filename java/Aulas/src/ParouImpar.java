import java.util.Scanner;

public class ParouImpar {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro ");
		numero = ler.nextInt();
		
		
		if( numero%2 == 0 && numero>0){
		System.out.println("O seu n�mero � par"); 
		}
		else if (numero%2 != 0 && numero>0){
		System.out.println("Seu n�mero � impar");
		}
		else if (numero < 0){
		System.out.println("Desculpa, n�o consigo te ajudar");
		}
		else if (numero == 0){
		System.out.println("Seu n�mero � neutro");
	}
		
	}

	
	
}
