import java.util.Scanner;

public class exercicio5java1 {
	public static void main(String[] args) {
		double nota1, nota2, nota3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe suas notas ");
		nota1 = ler.nextDouble();
		nota2 = ler.nextDouble();
		nota3 = ler.nextDouble();
		
		System.out.println("Sua média é: "+ (2*nota1 + 3*nota2 + 5*nota3)/10);
		
	}
}

