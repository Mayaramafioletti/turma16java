package java1;
import java.util.Scanner;
public class exerc�cio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, resultado1, resultado2;
		
		System.out.println("Escreva sua idade nem anos, meses e dias\nAnos: ");
		anos = ler.nextInt();
		System.out.println("Meses: ");
		meses = ler.nextInt();
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		resultado1 = anos*365;
		resultado2 = meses*30;
		
		System.out.println("Sua idade em dias �: "+resultado1+resultado2+dias);
	
	}
}


