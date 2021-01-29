import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		String times[] = {"CORITHIANS","PALMEIRAS","SANTOS","SPFC"};
		int pontos[] = new int[4];
		char resposta, pontuacao='s';
		int opcao;
		Scanner ler= new Scanner(System.in);
		
		for(int x=0; x<4; x++) {
			System.out.printf("Rodada %d\n", (x+1));
			for(int y=0; y<4; y++) {
				System.out.print(times[y]+": G-ganhou, P-perdeu ou E-empatou?");
				resposta = ler.next().toUpperCase().charAt(0);
				
				if(resposta == 'G') {
					pontos[y] = pontos[y]+3;
				}
				else if (resposta == 'E'){
					pontos[y] = pontos[y]+1;
				}
				else if (resposta =='P') {
					pontos[y] = pontos[y]+0;
				}
				else {
					System.out.println("Resposta inválida!");
				}
				
			}
		}
		
		System.out.println("\nEscolha um dos times para ver a pontuação: ");
		do {
			System.out.println("1 - Corithians\n2 - Palmeiras\n3 - Santos\n4 - SPFC");
			opcao = ler.nextInt();
			if(opcao == 1) {
				System.out.println(times[0]+" finalizou com "+pontos[0]+" pontos.\n");
				System.out.println("Quer ver a pontuação de outro time? S/N");
				pontuacao = ler.next().toUpperCase().charAt(0);
			}
			else if(opcao == 2) {
				System.out.println(times[1]+" finalizou com "+pontos[1]+" pontos.\n");
				System.out.println("Quer ver a pontuação de outro time? S/N");
				pontuacao = ler.next().toUpperCase().charAt(0);
			}
			else if(opcao == 3) {
				System.out.println(times[2]+" finalizou com "+pontos[2]+" pontos.\n");
				System.out.println("Quer ver a pontuação de outro time? S/N");
				pontuacao = ler.next().toUpperCase().charAt(0);
			}
			else if(opcao == 4) {
				System.out.println(times[3]+" finalizou com "+pontos[3]+" pontos.\n");
				System.out.println("Quer ver a pontuação de outro time? S/N");
				pontuacao = ler.next().toUpperCase().charAt(0);
			}
		}while(pontuacao == 'S');
		
		for(int z=0; z<4; z++) {
			System.out.println(times[z]+" finalizou com "+pontos[z]+" pontos.\n");
			System.out.println("Quer ver a pontuação de outro time? S/N");
			pontuacao = ler.next().toUpperCase().charAt(0);
		}
		
	}



public static void linha() {
	for(int x=0; x<100; x++) {
		System.out.println("-");
	}

}
}


/*
 * ele escolhe o time para ver a pontuação
 * 
*/