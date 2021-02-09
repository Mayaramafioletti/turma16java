package ExerciciosAula;
import java.util.Scanner;

public class ContaPoupança {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double saldo = 0.00, credito=0.00, debito=0.00;
	char opcaoDC;
	char opcaoSN;
	String descricao;
	
	
	System.out.println("CONTA POUPANÇA");
	
	//processos
	for (int giro=1; giro<=10; giro++)
	{
		System.out.printf("Você deseja D - debtar ou C - creditar o valor da conta?");
		opcaoDC = ler.next().toUpperCase().charAt(0);
		if (opcaoDC =='D')
		{
			System.out.print("\nDigite o valor para débito :");
			debito = ler.nextDouble();
			if (saldo > 0)
			{
				while (saldo < debito )
				{
					System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
					System.out.print("Digite o valor para débito :");
					debito = ler.nextDouble();
					
				}
				ler.nextLine();
				System.out.print("Descrição do débito :");
				descricao = ler.nextLine();
				saldo = saldo - debito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			} 
			else if (saldo == 0) 
			{
				System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
			}
		}
		else if (opcaoDC == 'C')
		{
			System.out.print("\nDigite o valor do crédito: ");
			credito = ler.nextDouble();
			while (credito <=0 )
			{
				System.out.print("Valor informado negativo ou zero, tente de novo:");
				System.out.print("Digite o valor do crédito: ");
				credito = ler.nextDouble();
			}
			ler.nextLine();
			System.out.print("Digite a descrição do crédito: ");
			descricao = ler.nextLine();
			saldo = saldo + credito;
			System.out.printf("Saldo atual é R$ %.2f \n", saldo);
		}
		else
		{
			System.out.println("Você não escolheu Debito ou Crédito!!!");
		}
		
		System.out.print("Continua S/N :");
		opcaoSN = ler.next().toUpperCase().charAt(0);
		if (opcaoSN == 'N')
		{
			break;
		}
	}
	//correção monetaria
	System.out.println("Deseja fazer a correção hoje sim ou não? ");
	opcaoSN = ler.next().toUpperCase().charAt(0);
	if (opcaoSN == 'S') 
	{
		saldo += (saldo * 0.0005);
	}
	System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldo);
	System.out.println();
	
}
}

