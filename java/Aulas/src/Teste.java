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
						+ "1 - CONTA POUPAN�A\n"
						+ "2 - CONTA CORRENTE\n"
						+ "3 - CONTA ESPECIAL\n"
						+ "4 - CONTA EMPRESA\n"
						+ "5 - CONTA ESTUDANTIL\n"
						+ "6 - SAIR\n\n"
						+ "SELECIONE O TIPO DE CONTA: ");

				opcao = ler.nextInt();

				if (opcao == 1) {
					
					System.out.println("\nCONTA POUPAN�A");
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
			System.out.println("\nDESEJA ACESSAR O BANCO COM OUTRO USU�RIO? [1 - SIM / 2 - N�O]");
			opcaoExterna = ler.nextInt();
		}

		ler.close();
	}
	
	/***FUN��O DO MENU CONTA CORRENTE***/
	static double menuContaCorrente(Scanner ler, double saldo) {

		System.out.println("SELECIONE O MOVIMENTO (D�BITO OU CR�DITO) - D/C:");
		char movimento = ler.next().charAt(0);
		System.out.println("VALOR:");
		double valor = ler.nextDouble();
		System.out.println("DESCRI��O:");
		String descricao = ler.next();
		System.out.printf("\nSALDO ATUAL: R$ %.2f\n", saldo);
		System.out.println("\nCONFIRMA A OPERA��O? S/N:");
		char continua = ler.next().charAt(0);
		/* o c�digo abaixo tentar� realizar a opera��o de d�bito ou cr�dito */
		if (continua == 's' || continua == 'S') {
			if (movimento == 'd' || movimento == 'D') { // d�bito
				if (saldo - valor >= 0) { // verifica se o saldo fica positivo
					saldo = saldo - valor;
					System.out.println("OPERA��O REALIZADA COM SUCESSO!");
				} else
					System.out.println("\nN�O FOI POSS�VEL REALIZAR A OPERA��O, POIS N�O H� SALDO O SUFICIENTE...\nCANCELANDO OPERA��O...");
			} else if (movimento == 'c' || movimento == 'C') { // cr�dito
				saldo = saldo + valor;
				System.out.println("OPERA��O REALIZADA COM SUCESSO!");
			} else
				System.out.println("OP��O " + movimento + " INV�LIDA...\nCANCELANDO OPERA��O...");

			System.out.printf("\nSALDO ATUAL: R$ %.2f\n", saldo);
		} else
			System.out.println("OPERA��O CANCELADA...\n");

		//parte referente aos tal�es de cheque
		System.out.println("\nDESEJA EMITIR TAL�ES DE CHEQUE? S/N");
		continua = ler.next().charAt(0);
		if (continua == 's' || continua == 'S') {
			int qtdTaloes;
			do {
				System.out.println("QUANTIDADE DE TAL�ES DE CHEQUE:");
				qtdTaloes = ler.nextInt();
				if (qtdTaloes <= 0 || qtdTaloes > 3) {
					System.out.println("VOC� PODE ESCOLHER ENTRE 1 E 3 TAL�ES DE CHEQUE. INSERIR UMA OUTRA QUANTIDADE? S/N:");
					continua = ler.next().charAt(0);
					if (continua != 's' && continua != 'S') { // sai do loop se o usu�rio n�o responder sim � pergunta anterior
						break;
					}
				}
				if (qtdTaloes > 0 && qtdTaloes <= 3) { // se a quantidade de tal�es est� dentro do aceit�vel
					System.out.println("\nIMPRIMINDO TAL�ES DE CHEQUE... ... ... FINALIZADO!");
				}
			} while (qtdTaloes < 0 || qtdTaloes > 3);

		}
		return saldo;
	}

	/***FUN��O DO MENU CONTA ESPECIAL***/
	static double menuContaEspecial(Scanner ler, double saldo) {
		double total=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar='s' ;
		String descricao;
		
		
		System.out.println("\nVoc� selecionou a conta especial.");
		for(int giro=0; giro<10; giro++) {
			do {
				System.out.println("Voc� deseja D - debtar ou C - creditar o valor da conta?");
				debtar = ler.next().charAt(0);
				if(debtar=='C' || debtar=='c') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
					total += valor;
					System.out.println("Qual a descri�ao: ");
					descricao = ler.next();
				}
				else if(debtar=='D' || debtar=='d') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
					System.out.println("Qual a descri�ao: ");
					descricao = ler.next();
					total -= valor;	
				}
				else {
					System.out.println("Resposta n�o reconhecida. Deseja recome�ar? S/N");
					continuar = ler.next().charAt(0);
				}
				if(total<0) {
					System.out.print("Saldo negativo. Deseja recome�ar? S/N ");
					continuar = ler.next().charAt(0);
				}
				else {
					System.out.printf("Ok, seu saldo � %.2f. Deseja parar? S/N ", total);
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
			System.out.println("Ok, agora vamos falar sobre se limite especial.\nO seu saldo � de "+total);
			
			System.out.print("Voc� deseja usar seu limite? S/N ");
			opcao = ler.next().charAt(0);
			if(opcao=='S' || opcao=='s') {
				System.out.print("Quanto do limite voc� deseja usar? ");
				limite = ler.nextDouble();
				soma +=limite;
				if (soma>1000) {
					System.out.print("Voc� ultrapassou o valor do seu limite ");
					System.out.print("Voc� deseja recome�ar? S/N ");
					recomecar = ler.next().charAt(0);
				}
				else if(soma<0) {
					System.out.println("Valor incorreto!");
					System.out.print("Voc� deseja recome�ar? S/N ");
					recomecar = ler.next().charAt(0);
				}
			
				else {
					System.out.printf("Ok, obrigada! Voc� est� usando R$%.2f do seu limite especial, ent�o seu saldo agora � de R$%.2f", limite, total+limite);
					System.out.print("\nDesejar usar o limite novamente?");
					recomecar = ler.next().charAt(0);
				}
			}
			}while(recomecar=='s' || recomecar=='S');
		
		System.out.println("Obrigada por usar nossos servi�os!");
		return continuar;
		
	}
}
