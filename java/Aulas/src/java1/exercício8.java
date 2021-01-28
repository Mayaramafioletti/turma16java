package java1;

import java.util.Scanner;

public class exercício8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double Cfabrica, Cconsumidor;

		System.out.println("Informe o custo de fábrica do carro: ");
		Cfabrica = ler.nextDouble();

		Cconsumidor = Cfabrica + 0.28*Cfabrica + 0.45*Cfabrica;

		System.out.println("O custo do consumidor é: R$" +Cconsumidor);
	}
}