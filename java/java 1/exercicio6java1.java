import java.util.Scanner;
import java.math.*;

public class exercicio6java1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1,x2,y1,y2,d,valor;
		
		System.out.println("Informe as coordenadas do primeiro ponto:");
		x1 = ler.nextDouble();
		x2 = ler.nextDouble();
		System.out.println("Informe as coordenadas do segundo ponto:");
		y1 = ler.nextDouble();
		y2 = ler.nextDouble();
		
		valor = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
		d = Math.sqrt(valor);

		System.out.println("A distância entre os pontos é: "+d);
	}
}
