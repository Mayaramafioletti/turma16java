import java.util.Scanner;


public class exercicio7java1 {
	public static void main(String[] args) {
	double a,b,c,d,e,f = 0,x,y;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe os 6 valores que gostaria de calcular para achar x e y: ");
	a = ler.nextDouble();
	b = ler.nextDouble();
	c = ler.nextDouble();
	d = ler.nextDouble();
	e = ler.nextDouble();
	
	System.out.println("O resultado de x é: "+(c*e-b*f)/(a*e-b*d));
	System.out.println("O resultado de y é: "+(a*f-c*d)/(a*e-b*d));
	
	}
}
