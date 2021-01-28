import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double saldo=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar = 's';
		
		
		System.out.println("\nVocê selecionou a conta especial.");
		do {
			System.out.println("Você deseja D - debtar ou C - creditar o valor da conta?");
			debtar = ler.next().charAt(0);
			if(debtar=='D' || debtar=='d') {
				System.out.println("Qual o valor?");
				valor = ler.nextDouble();
				saldo += valor;
			}
			else if(debtar=='C' || debtar=='c') {
				System.out.println("Qual o valor?");
				valor = ler.nextDouble();
				saldo -= valor;	
			}
			else {
				System.out.println("Resposta não reconhecida. Deseja recomeçar? S/N");
				continuar = ler.next().charAt(0);
			}
			if(saldo<0) {
				System.out.println("Saldo negativo. Deseja recomeçar? S/N");
				continuar = ler.next().charAt(0);
			}
			else {
			System.out.printf("Ok, seu saldo é %.2f. Deseja parar? S/N", saldo);
			continuar = ler.next().charAt(0);
			}
		}while(continuar=='s' || continuar == 's');
		do{
			saldo+=limite;
			System.out.println("O seu saldo é de "+saldo);
			
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
			}
				else {
					
					System.out.printf("Ok, obrigada! Você está usando R$%.2f do seu limite especial, então seu saldo agora é de R$%.2f", limite, saldo+limite);
					System.out.print("\nDesejar usar o limite novamente?");
					recomecar = ler.next().charAt(0);
				}
		}while(recomecar=='s' || recomecar=='S');
		
		System.out.println("Obrigada por usar nossos serviços!");
		
	}
}
