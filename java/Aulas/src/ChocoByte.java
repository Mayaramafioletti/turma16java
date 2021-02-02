	import java.util.Scanner;
	import java.util.Date;
	
public class ChocoByte {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			Date data = new Date();
					
			String sabores[] = {"Ao leite  ","Branco    ","Airado    ","Meio amargo","Amargo     ","Avelã   ","Trufado  ","Sem lactose","Chocowhey","Vegan    "};
			double precos[] = {14.90 , 15.90, 15.90 , 18.50, 19.90, 19.90, 22.00, 23.90, 23.90, 23.90};
			double pagamento[] =  new double[10];
			int estoque[] = {10 , 10 , 10 , 10 , 10 , 10 , 10 , 10 , 10 , 10};
			int opcao;
			char c ='%';
			
			do //REPETIR
			{		
				double valorTotal = 0.0;
				int carrinho[] = new int[10];		
				int  unidade = 0, sexo = 0, cod, cont = 0;
				boolean  continua = true;
				String nome, genero;
				
				//SOLICITANDO INFORMAÇÕES
				
				System.out.print("Digite seu nome: ");
				nome = scan.next();
				
				System.out.print("Qual sua identificação sexual(1-feminino / 2-masculino / 3-Outros): ");
				sexo = scan.nextInt();
				
				if(sexo == 1)
				{
					genero = "Sra.";
				}
				else if(sexo == 2)
				{
					genero = "Sr.";
				}
				else
				{
					genero = "Sre.";
				}
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				//TELA DE INICIO
				System.out.printf("Bem vindo ao ChocoByte %s %s.\n", genero, nome);
				
				do //repete se a pessoa quer comprar outro produto
				{
					System.out.println("\nProdutos disponíveis: \nCód: \tEstoque:\tPreço:\t\tSabores: ");
					
					for(int i =0; i<10;i++)
					{
						System.out.printf("%d \t%d \t\t%.2f \t\t%s \n",(i+1),(estoque[i]-carrinho[i]),precos[i],sabores[i]);
					}
					
					System.out.print("\nEscolha o cod do produto desejado: ");
					
					do //verifica se é possivel realizar compra do item / estoque diferente de zero
					{
						continua = false;
						
						cod = scan.nextInt();
						
						if(estoque[cod-1]== 0)
						{
							continua = true;
							System.out.print("Produto ESGOTADO, selecione outro cod: ");
						}	
					}
					while(continua);	
					
					if(carrinho[cod-1] != 0) //Cod existente, carrinho com unidade
					{
						System.out.printf("Você ja possui ChocoByte %s no carrinho, deseja:(1-Acrescentar / 2- Retirar) produtos? : ", sabores[cod -1]);
						opcao = scan.nextInt();
						
						if(opcao == 1)
						{						
							System.out.printf("Quantas unidades de ChocoByte %s deseja acrescentar ao carrinho? : ", sabores[cod -1]);
							unidade = scan.nextInt();
							
							do
							{
								if((unidade+carrinho[cod-1])<= estoque[cod-1])
								{
									carrinho[cod-1] += unidade;
									System.out.print("Produto adicionado ao carrinho.\nDeseja: (1 - Selecionar Novo Produto / 2- Finalizar compra)? :");
									opcao = scan.nextInt();	
									continua = false;
								}
								else 
								{
									System.out.printf("Ação Inválida. Quantidade Disponivel: %d \ndigite a quantidade desejada: ", (estoque[cod -1]-carrinho[cod-1]));
									unidade = scan.nextInt();
									continua = true;
								}
							}
							while(continua);
							
						}
						else if(opcao == 2)
						{
							System.out.printf("Quantas unidades de ChocoByte %s deseja retirar do carrinho? : ", sabores[cod -1]);
							unidade = scan.nextInt();
							
							do
							{
								if(carrinho[cod-1] >= unidade)
								{
									carrinho[cod-1] -= unidade;
									System.out.print("Produto retirado do carrinho.\nDeseja: (1 - Selecionar Novo Produto / 2- Finalizar compra)? :");
									opcao = scan.nextInt();	
									continua = false;
								}
								else 
								{
									System.out.printf("Ação Inválida. Quantidade Disponivel para retirada: %d \nDigite a quantidade desejada: ", (carrinho[cod-1]));
									unidade = scan.nextInt();
									continua = true;
								}
							}
							while(continua);
						}
						else
						{
							System.out.println("Opção Inválida\nDeseja continuar? [1-SIM / 2-NÃO");
							opcao = scan.nextInt();
						}
					}
					else     //	Primeira compra
					{	
						System.out.printf("Quantas unidades de ChocoByte %s deseja comprar? : ", sabores[cod -1]);
						unidade = scan.nextInt();
						do
						{
							if(unidade <= estoque[cod-1])
							{
								continua = false;
								carrinho[cod-1] = unidade;	
							}
							else
							{
								System.out.printf("Ação Inválida. Quantidade Disponivel: %d \nDigite a quantidade desejada: ", estoque[cod -1]);
								unidade = scan.nextInt();
								continua = true;
							}
					
						}while(continua);
						
						System.out.print("Produto adicionado ao carrinho.\nDeseja: (1 - Selecionar Novo Produto / 2- Finalizar compra)? :");
						opcao = scan.nextInt();
					}
					
				}while(opcao == 1);
				
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("[PRODUTO] \t\t[QTDE] \t\t\t[VALOR FINAL]"  );
				
				for(int i = 0; i<10; i++)
				{
					if(carrinho[i] !=0)
					{
						pagamento[i] = precos[i] * carrinho[i];
						estoque[i] -= carrinho[i];  // estoque[i] = estoque[i] - carrinho[i]
						valorTotal += pagamento[i];
						
						 System.out.printf("\nChocobyte %s\t%d uni.\t\t\tR$%.2f", sabores[i],(carrinho[i]),(pagamento[i]) );
					}
				}
				
				System.out.printf("\n\n[VALOR FINAL]                                   R$%.2f\n", valorTotal  );
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("OPÇÕES DE PAGAMENTO:\n" );
				System.out.printf("1 - A VISTA    - 10%c DESCONTO     - \tR$ %.2f\n", c, (valorTotal * 0.9));
				System.out.printf("2 - CREDITO 1X - SEM DESCONTO     - \tR$ %.2f\n", (valorTotal));
				System.out.printf("3 - CREDITO 2X - 10%c JUROS        - \tR$ %.2f\n", c, (valorTotal * 1.1));
				System.out.printf("4 - CREDITO 3X - 15%c JUROS        - \tR$ %.2f\n", c, (valorTotal * 1.15));
				System.out.print("\nSelecione uma Opção de Pagamento [1-4]: ");
				
				opcao = scan.nextInt();
				
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
				System.out.printf("Imposto 9%c: R$%.2f\n" ,c , (valorTotal*0.09));
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println(data); //data
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("Consumidor: "+ nome);
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("                           CUPOM FISCAL   ");
				System.out.println("\n[PRODUTO] \t\t[QTDE] \t\t\t[VALOR FINAL]"  );
				
				for(int i = 0; i<10; i++)
				{
					if(carrinho[i] !=0)
					{
						 System.out.printf("\nChocobyte %s\t%d uni.\t\t\tR$%.2f", sabores[i],(carrinho[i]),(pagamento[i]) );
					}
				}
				
				System.out.println("\n-------------------------------------------------------------------------------------");
				
				if(opcao == 1) 
				{
					System.out.printf("[VALOR FINAL]                                   R$%.2f", (valorTotal*0.9));
					System.out.printf("\n\nA VISTA                                         R$%.2f",(valorTotal*0.9));
				}
				else if(opcao == 2)
				{
					System.out.printf("[VALOR FINAL]                                   R$%.2f", valorTotal);
					System.out.printf("\n\nCREDITO 1X                                      R$%.2f",valorTotal);
				}
				else if(opcao == 3)
				{
					System.out.printf("[VALOR FINAL]                                   R$%.2f", (valorTotal*1.1));
					System.out.printf("\n\nCREDITO 2X                                      R$%.2f",((valorTotal*1.1)/2));
				}
				else
				{
					System.out.printf("[VALOR FINAL]                                   R$%.2f", (valorTotal*1.15));
					System.out.printf("\n\nCREDITO 3X                                      R$%.2f",((valorTotal*1.15)/3));
				}
				System.out.println("\n-------------------------------------------------------------------------------------");
				
				System.out.print("Novo Cliente [1-SIM / 2-NÃO]: ");
				opcao = scan.nextInt();
				
				for(int i = 0; i<10;i++)
				{
					cont += estoque[i];
				}
				
				if(cont == 0)
				{
					System.out.println("\n-------------------------------------------------------------------------------------");
					System.out.println("Realizado a reposição do estoque!");
					System.out.println("-------------------------------------------------------------------------------------");
					
					for(int i = 0; i<10;i++)
					{
						 estoque[i]= 10;
					}
				}
			}
			while(opcao == 1);	
			scan.close();
				
		}
	}

