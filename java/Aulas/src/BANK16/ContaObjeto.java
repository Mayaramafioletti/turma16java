package BANK16;

import java.util.Scanner;

public class ContaObjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaCorrente infoCorrente = new ContaCorrente(null, null, 0);
		
		
		System.out.print("N�mero da conta: ");
		String numero = ler.next();
		System.out.print("Cpf: ");
		String cpf = ler.next();
		System.out.println("Dia do anivers�rio: ");
		int dia = ler.nextInt();
		while(dia<=0 || dia>31) {
			System.out.println("Data invalida!! Tente novamente [1-31]");
			dia = ler.nextInt();
		}
		ContaPoupan�a infoPoupanca = new ContaPoupan�a(numero, cpf, dia);
		
			Conta info = new Conta(numero,cpf);
			int opcao;
			double valor;
			for(int x=1; x<4; x++) { 
				System.out.println("Ol�, seu saldo � R$"+info.getSaldo());
				System.out.print("Gostaria de fazer um 1-D�bito ou 2-Cr�dito na conta?  ");
				opcao = ler.nextInt();
				System.out.print("Qual o valor?  ");
				valor = ler.nextDouble();
				
				if (opcao == 1) {
					info.debitar(valor);
				}
				else if(opcao == 2) {
					info.creditar(valor);
				}
				else {
					System.out.println("Op��o inv�lida!!");
				}
				
				//N�O FINALIZADO 
				
				System.out.println("Seu saldo agora � R$"+info.getSaldo()+"\n");
				
			}
		}
	}
		
