package java2;
import java.util.Scanner;

public class exercício2 {
	public static void main(String[] args) {
		double numero1, numero2, numero3;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe três números: ");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		numero3 = ler.nextInt();
		
		if(numero1>=numero2 && numero1>=numero3 && numero2>=numero3) {
			System.out.println(numero3+" " +numero2+" "+ numero1);
		}
		else if(numero1>=numero2 && numero1>=numero3 && numero3>=numero2) {
			System.out.println(numero2+" "+ numero3+" "+ numero1);
		}
		else if(numero2>=numero3 && numero2>=numero1 && numero1>=numero3) {
			System.out.printf(numero3+" "+numero1+" "+numero2);
		}
		else if(numero2>=numero3 && numero2>=numero1 && numero3>=numero2) {
			System.out.printf(numero1+" "+numero3+" "+numero2);
		}
		else if(numero3>=numero2 && numero3>=numero1 && numero2>=numero1) {
			System.out.printf(numero1+" "+numero2+" "+numero3);
		}
		else if(numero3>=numero2 && numero3>=numero1 && numero1>=numero2) {
			System.out.printf(numero2+" "+numero1+" "+numero3);
		}
	}
}

