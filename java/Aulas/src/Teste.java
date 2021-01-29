import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcaoExterna = 1;

		while (opcaoExterna == 1) {

			int opcao = 0;
			double saldo = 0;

			while (true) {

				System.out.print("NOME DO BANCO G#"
						+ "\nSLOGAN - FRASE"
						+ "\n"
						+ "\n"
						+ "1 - CONTA POUPANÇA\n"
						+ "2 - CONTA CORRENTE\n"
						+ "3 - CONTA ESPECIAL\n"
						+ "4 - CONTA EMPRESA\n"
						+ "5 - CONTA ESTUDANTIL\n"
						+ "6 - SAIR\n\n"
						+ "SELECIONE O TIPO DE CONTA: ");

				opcao = ler.nextInt();

				if (opcao == 1) {
					
					System.out.println("\nCONTA POUPANÇA");
					//saldo = menuContaPoupanca(ler, saldo);
				}
				else if (opcao == 2) {
					
					System.out.println("\nCONTA CORRENTE");
					saldo = menuContaCorrente(ler, saldo);
				}
				else if (opcao == 3) {
					
					System.out.println("\nCONTA ESPECIAL ");
					saldo = menuContaEspecial(ler, saldo);
				}
				else if (opcao == 4) {
					
					System.out.println("\nCONTA EMPRESA");
					//saldo = menuContaEmpresa(ler, saldo);
				}
				else if (opcao == 5) {
					
					System.out.println("\nCONTA ESTUDANTIL");
					//saldo = menuContaEstudantil(ler, saldo);
				}
				else if (opcao == 6) {
					
					System.out.print("SAINDO DA SUA CONTA...");
					break; // sai do loop
				}
				System.out.println("\n");
			}
			System.out.println("\nDESEJA ACESSAR O BANCO COM OUTRO USUÁRIO? [1 - SIM / 2 - NÃO]");
			opcaoExterna = ler.nextInt();
		}

		ler.close();
	}
	
	/***FUNÇÃO DO MENU CONTA CORRENTE***/
	static double menuContaCorrente(Scanner ler, double saldo) {

		System.out.println("SELECIONE O MOVIMENTO (DÉBITO OU CRÉDITO) - D/C:");
		char movimento = ler.next().charAt(0);
		System.out.println("VALOR:");
		double valor = ler.nextDouble();
		System.out.println("DESCRIÇÃO:");
		String descricao = ler.next();
		System.out.printf("\nSALDO ATUAL: R$ %.2f\n", saldo);
		System.out.println("\nCONFIRMA A OPERAÇÃO? S/N:");
		char continua = ler.next().charAt(0);
		/* o código abaixo tentará realizar a operação de débito ou crédito */
		if (continua == 's' || continua == 'S') {
			if (movimento == 'd' || movimento == 'D') { // débito
				if (saldo - valor >= 0) { // verifica se o saldo fica positivo
					saldo = saldo - valor;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO!");
				} else
					System.out.println("\nNÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO, POIS NÃO HÁ SALDO O SUFICIENTE...\nCANCELANDO OPERAÇÃO...");
			} else if (movimento == 'c' || movimento == 'C') { // crédito
				saldo = saldo + valor;
				System.out.println("OPERAÇÃO REALIZADA COM SUCESSO!");
			} else
				System.out.println("OPÇÃO " + movimento + " INVÁLIDA...\nCANCELANDO OPERAÇÃO...");

			System.out.printf("\nSALDO ATUAL: R$ %.2f\n", saldo);
		} else
			System.out.println("OPERAÇÃO CANCELADA...\n");

		//parte referente aos talões de cheque
		System.out.println("\nDESEJA EMITIR TALÕES DE CHEQUE? S/N");
		continua = ler.next().charAt(0);
		if (continua == 's' || continua == 'S') {
			int qtdTaloes;
			do {
				System.out.println("QUANTIDADE DE TALÕES DE CHEQUE:");
				qtdTaloes = ler.nextInt();
				if (qtdTaloes <= 0 || qtdTaloes > 3) {
					System.out.println("VOCÊ PODE ESCOLHER ENTRE 1 E 3 TALÕES DE CHEQUE. INSERIR UMA OUTRA QUANTIDADE? S/N:");
					continua = ler.next().charAt(0);
					if (continua != 's' && continua != 'S') { // sai do loop se o usuário não responder sim à pergunta anterior
						break;
					}
				}
				if (qtdTaloes > 0 && qtdTaloes <= 3) { // se a quantidade de talões está dentro do aceitável
					System.out.println("\nIMPRIMINDO TALÕES DE CHEQUE... ... ... FINALIZADO!");
				}
			} while (qtdTaloes < 0 || qtdTaloes > 3);

		}
		return saldo;
	}

	/***FUNÇÃO DO MENU CONTA ESPECIAL***/
	static double menuContaEspecial(Scanner ler, double saldo) {
		double total=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar='s' ;
		String descricao;
		
		
		System.out.println("\nVocê selecionou a conta especial.");
		for(int giro=0; giro<10; giro++) {
			do {
				System.out.println("Você deseja D - debtar ou C - creditar o valor da conta?");
				debtar = ler.next().charAt(0);
				if(debtar=='C' || debtar=='c') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
					total += valor;
					System.out.println("Qual a descriçao: ");
					descricao = ler.next();
				}
				else if(debtar=='D' || debtar=='d') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
					System.out.println("Qual a descriçao: ");
					descricao = ler.next();
					total -= valor;	
				}
				else {
					System.out.println("Resposta não reconhecida. Deseja recomeçar? S/N");
					continuar = ler.next().charAt(0);
				}
				if(total<0) {
					System.out.print("Saldo negativo. Deseja recomeçar? S/N ");
					continuar = ler.next().charAt(0);
				}
				else {
					System.out.printf("Ok, seu saldo é %.2f. Deseja parar? S/N ", total);
					continuar = ler.next().charAt(0);
					
				}
			}while(continuar=='s' || continuar == 'S'); 
			if (continuar == 'N')
					{
						break;
					}
		}
		do{
			total+=limite;
			System.out.println("Ok, agora vamos falar sobre se limite especial.\nO seu saldo é de "+total);
			
			System.out.print("Você deseja usar seu limite? S/N ");
			opcao = ler.next().charAt(0);
			if(opcao=='S' || opcao=='s') {
				System.out.print("Quanto do limite você deseja usar? ");
				limite = ler.nextDouble();
				soma +=limite;
				if (soma>1000) {
					System.out.print("Você ultrapassou o valor do seu limite ");
					System.out.print("Você deseja recomeçar? S/N ");
					recomecar = ler.next().charAt(0);
				}
				else if(soma<0) {
					System.out.println("Valor incorreto!");
					System.out.print("Você deseja recomeçar? S/N ");
					recomecar = ler.next().charAt(0);
				}
			
				else {
					System.out.printf("Ok, obrigada! Você está usando R$%.2f do seu limite especial, então seu saldo agora é de R$%.2f", limite, total+limite);
					System.out.print("\nDesejar usar o limite novamente?");
					recomecar = ler.next().charAt(0);
				}
			}
			}while(recomecar=='s' || recomecar=='S');
		
		System.out.println("Obrigada por usar nossos serviços!");
		return continuar;
		
	}
}
