import java.util.Scanner;

public class ParouImpar {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número inteiro ");
		numero = ler.nextInt();
		
		
		if( numero%2 == 0 && numero>0){
		System.out.println("O seu número é par"); 
		}
		else if (numero%2 != 0 && numero>0){
		System.out.println("Seu número é impar");
		}
		else if (numero < 0){
		System.out.println("Desculpa, não consigo te ajudar");
		}
		else if (numero == 0){
		System.out.println("Seu número é neutro");
	}
		
	}

	
	
}
