



public class TesteBanco
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
				
				if (opcao == 1)
				{
					System.out.println("CONTA POUPANÇA");
				}
				else if (opcao == 2)
				{
					System.out.println("CONTA CORRENTE");
					
				}
				else if (opcao == 3)
				{
					System.out.println("CONTA ESPECIAL ");
				}
				else if (opcao == 4)
				{
					System.out.println("CONTA EMPRESA");
				}
				else if (opcao == 5)
				{
					System.out.println("CONTA ESTUDANTIL");
				}
				else if (opcao == 6)
				{
					System.out.print("Saindo da sua conta ...");
					break; //sai do loop
				}
				System.out.println("\n\n\n");
			}
			System.out.println("\nDeseja acessar a conta com outro usuário? [1 - sim / 2 - não]");
			opcaoExterna = ler.nextInt();
		}
		
		ler.close();
	}
