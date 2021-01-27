import java.math.*;
import java.util.Scanner;

public class exercicio4java1 {
	public static void main(String[] args) {
		int a,b,c;
		double r,s,d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escolha três números inteiros e positivos: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((a+b), 2);
		d = (r+s)/2;
		
		System.out.println("O resultado é: "+d);
	}
}
