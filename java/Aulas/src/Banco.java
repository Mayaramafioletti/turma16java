import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double saldo=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar = 's';
		
		
		System.out.println("\nVoc� selecionou a conta especial.");
		do {
			System.out.println("Voc� deseja D - debtar ou C - creditar o valor da conta?");
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
				System.out.println("Resposta n�o reconhecida. Deseja recome�ar? S/N");
				continuar = ler.next().charAt(0);
			}
			if(saldo<0) {
				System.out.println("Saldo negativo. Deseja recome�ar? S/N");
				continuar = ler.next().charAt(0);
			}
			else {
			System.out.printf("Ok, seu saldo � %.2f. Deseja parar? S/N", saldo);
			continuar = ler.next().charAt(0);
			}
		}while(continuar=='s' || continuar == 's');
		do{
			saldo+=limite;
			System.out.println("O seu saldo � de "+saldo);
			
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
			}
				else {
					
					System.out.printf("Ok, obrigada! Voc� est� usando R$%.2f do seu limite especial, ent�o seu saldo agora � de R$%.2f", limite, saldo+limite);
					System.out.print("\nDesejar usar o limite novamente?");
					recomecar = ler.next().charAt(0);
				}
		}while(recomecar=='s' || recomecar=='S');
		
		System.out.println("Obrigada por usar nossos servi�os!");
		
	}
}
