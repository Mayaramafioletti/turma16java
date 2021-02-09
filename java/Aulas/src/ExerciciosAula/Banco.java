package ExerciciosAula;
import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		double total=0, limite=0, soma=0, valor = 0;
		char opcao, recomecar = 's', debtar= 'd', continuar ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nVocê selecionou a conta especial.");
		for(int giro=0; giro<10; giro++) {
			do {
				System.out.println("Você deseja D - debtar ou C - creditar o valor da conta?");
				debtar = ler.next().charAt(0);
				if(debtar=='C' || debtar=='c') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
					total += valor;
				}
				else if(debtar=='D' || debtar=='d') {
					System.out.println("Qual o valor?");
					valor = ler.nextDouble();
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
			}while(continuar=='s' || continuar == 'S');  //dando erro
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
	}
}