package BANK16;

import java.util.Scanner;

public class ContaObjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaCorrente infoCorrente = new ContaCorrente(null, null, 0);
		
		
		System.out.print("Número da conta: ");
		String numero = ler.next();
		System.out.print("Cpf: ");
		String cpf = ler.next();
		System.out.println("Dia do aniversário: ");
		int dia = ler.nextInt();
		while(dia<=0 || dia>31) {
			System.out.println("Data invalida!! Tente novamente [1-31]");
			dia = ler.nextInt();
		}
		ContaPoupança infoPoupanca = new ContaPoupança(numero, cpf, dia);
		
			Conta info = new Conta(numero,cpf);
			int opcao;
			double valor;
			for(int x=1; x<4; x++) { 
				System.out.println("Olá, seu saldo é R$"+info.getSaldo());
				System.out.print("Gostaria de fazer um 1-Débito ou 2-Crédito na conta?  ");
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
					System.out.println("Opção inválida!!");
				}
				
				//NÃO FINALIZADO 
				
				System.out.println("Seu saldo agora é R$"+info.getSaldo()+"\n");
				
			}
		}
	}
		
