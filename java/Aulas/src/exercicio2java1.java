import java.util.Scanner;

public class exercicio2java1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade,anos,meses,dias;
		
		System.out.println("Informe sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		
		System.out.println("Sua idade é "+anos+" anos, "+meses+" meses e "+dias+" dias!");
		
	}
}
