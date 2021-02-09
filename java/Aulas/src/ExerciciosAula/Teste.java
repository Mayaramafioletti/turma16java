package ExerciciosAula;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcaoExterna = 1;

		while (opcaoExterna == 1) {

			int opcao = 0;
			double saldo = 0;

			while (true) {

				System.out.print("MANVOBANK "
						+ "\nOnde seu dinheiro vale ouro!"
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
					saldo = menuContaPoupanca(ler, saldo);
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
					saldo = menuContaEmpresa(ler, saldo);
				}
				else if (opcao == 5) {
					
					System.out.println("\nCONTA ESTUDANTIL");
					saldo = menuContaEstudantil(ler, saldo);
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
	
	static double menuContaPoupanca(Scanner ler, double saldo) {
		double credito=0.00, debito=0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao;
		
		
		System.out.println("CONTA POUPAN�A");
		
		//processos
		for (int giro=1; giro<=10; giro++)
		{
			System.out.printf("Voc� deseja D - debtar ou C - creditar o valor da conta?");
			opcaoDC = ler.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para d�bito :");
				debito = ler.nextDouble();
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para d�bito :");
						debito = ler.nextDouble();
						
					}
					ler.nextLine();
					System.out.print("Descri��o do d�bito :");
					descricao = ler.nextLine();
					saldo = saldo - debito;
					System.out.printf("Saldo atual � R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Voc� est� sem saldo no momento, fa�a um cr�dito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do cr�dito: ");
				credito = ler.nextDouble();
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do cr�dito: ");
					credito = ler.nextDouble();
				}
				ler.nextLine();
				System.out.print("Digite a descri��o do cr�dito: ");
				descricao = ler.nextLine();
				saldo = saldo + credito;
				System.out.printf("Saldo atual � R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("Voc� n�o escolheu Debito ou Cr�dito!!!");
			}
			
			System.out.print("Continua S/N :");
			opcaoSN = ler.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}
		//corre��o monetaria
		System.out.println("Deseja fazer a corre��o hoje sim ou n�o? ");
		opcaoSN = ler.next().toUpperCase().charAt(0);
		if (opcaoSN == 'S') 
		{
			saldo += (saldo * 0.0005);
		}
		System.out.printf("SALDO FINAL DA CONTA POUPAN�A %.2f \n", saldo);
		System.out.println();
		return 0;
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
		char opcao, recomecar = 's', debtar= 'd', continuar='s';
		String descricao;
		
		
		System.out.println("\nVoc� selecionou a conta especial.");
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
					System.out.printf("Ok, seu saldo � %.2f. Deseja fazer um novo debto ou cr�dito? S/N ", total);
					continuar = ler.next().charAt(0);
					
				} 
			
		}while(continuar=='s' || continuar == 'S');
		do{
			total+=limite;
			System.out.println("Ok, agora vamos falar sobre seu limite especial.\nO seu saldo � de "+total);
			
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
		
		System.out.println("\nObrigada por usar nossos servi�os!");
		return 0;
		
		
		}
	

	static double menuContaEmpresa(Scanner ler, double saldo) {
		double total=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar='s';
		String descricao;
		
		
		System.out.println("\nVoc� selecionou a conta empres�rial.");
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
					System.out.printf("Ok, seu saldo � %.2f. Deseja fazer um novo debto ou cr�dito? S/N ", total);
					continuar = ler.next().charAt(0);
					
				} 
			
		}while(continuar=='s' || continuar == 'S');
		
		do{
			total+=limite;
			System.out.println("Ok, agora vamos falar sobre sua conta empresarial.\nO seu saldo � de "+total);
			
			System.out.print("Voc� deseja fazer um empr�stimo? S/N ");
			opcao = ler.next().charAt(0);
			if(opcao=='S' || opcao=='s') {
				System.out.print("Quanto voc� deseja? ");
				limite = ler.nextDouble();
				soma +=limite;
				if (soma>10000) {
					System.out.print("Voc� ultrapassou o valor do limite do empr�stimo");
					System.out.print("Voc� deseja recome�ar? S/N ");
					recomecar = ler.next().charAt(0);
				}
				else if(soma<0) {
					System.out.println("Valor incorreto!");
					System.out.print("Voc� deseja recome�ar? S/N ");
					recomecar = ler.next().charAt(0);
				}
			
				else {
					System.out.printf("Ok, obrigada! Voc� est� usando R$%.2f do seu limite para empr�stimo, ent�o seu saldo agora � de R$%.2f", limite, total+limite);
					System.out.print("\nDeseja fazer um novo empr�stimo?");
					recomecar = ler.next().charAt(0);
				}
			}
			}while(recomecar=='s' || recomecar=='S');
		
		System.out.println("\nObrigada por usar nossos servi�os!");
		return 0;
		}

	static double menuContaEstudantil(Scanner ler, double saldo) {
		int tipo;
		char mov,opc,ces,fim;
		String desc;
		double valor=0.0,saldoAtual=0.0, credito=0.0,debito=0.0;
		double emprestimo=0.0,valorEmprestimo=0.00,saldoFinal=0.00;
		char opcao;
		
		System.out.print("\nVoc� selecionou a Conta Estudandil");
		for(int i=1;i<=10;i++)
		{
				    	
			System.out.printf("\n%d�Consulta: Escolha D-D�bito/C-Cr�dito",i);	
			mov=ler.next().toUpperCase().charAt(0);
			if(mov=='D')
			{
				System.out.printf("\nDigite o valor para d�bito: ");
				debito=ler.nextDouble();
				if(saldo>0)
				{
					while(saldo<debito)
					{
						System.out.printf("\nSaldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("\nDigite o valor para d�bito :");
						debito = ler.nextDouble();
					}
					ler.nextLine();
					System.out.print("\nDescri��o do d�bito :");
					desc = ler.nextLine();
					saldo = saldo - debito;
					System.out.printf("\nSaldo atual � R$ %.2f\n", saldo);
				}
				else if (saldo==0)
				{
					System.out.println("\n0 saldo, fa�a um cr�dito primeiro!!!");
				}
			}
			else if (mov=='C')
			{
				System.out.print("\nDigite o valor do cr�dito: ");
				credito = ler.nextDouble();
				while (credito <=0 )
				{
					System.out.print("\nValor informado negativo ou zero, tente de novo:");
					System.out.print("\nDigite o valor do cr�dito: ");
					credito = ler.nextDouble();
				}
				ler.nextLine();
				System.out.print("\nDigite a descri��o do cr�dito: ");
				desc = ler.nextLine();
				saldo = saldo + credito;
				System.out.printf("\nSaldo atual � R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("\nVoc� n�o escolheu Debito ou Cr�dito!!!");
			}
			
			System.out.print("\nContinua S/N :");
			fim = ler.next().toUpperCase().charAt(0);
			if (fim == 'N')
			{
				break;
			}
			
			
		}
			System.out.printf("\nDESEJA USAR O LIMITE DE ESTUDANTE - S/N:");
			System.out.printf("\nSE SIM ELE TE PODE USAR 5 MIL: ");
			opcao = ler.next().toUpperCase().charAt(0);
			
			
			do//if(opcao=='S')
			{
				
				System.out.printf("\nInsira o valor do Empr�stimo:");
				emprestimo = ler.nextDouble();
				if(emprestimo<5000)
				{
					valorEmprestimo=emprestimo;
					
				}
				else 
				{
					System.out.printf("\nValor Inv�lido");
				}
				
				saldoFinal=valorEmprestimo+saldo;
				System.out.printf("\nO saldo final da sua conta �: %.2f\n",saldoFinal);
				
				System.out.printf("\nDESEJA CONTINUAR?- S/N: ");
				opcao = ler.next().toUpperCase().charAt(0);
			}while(opcao=='S');	
			
			System.out.printf("\nOBRIGADO POR UTILIZAR NOSSOS SERVI�OS ");
			return 0;
			
		}
}
	
