programa
{
	
	funcao inicio()
	{
		cadeia nome, agenda[24][32]
		inteiro dia, hora
		caracter continuar = ' '
		

		escreva("Seja bem-vinde!")
	
			faca
			{
				escreva("\nInforme o seu nome: ")
				leia(nome)
				faca
				{
				
				escreva("\nInforme a data do evento [1 até 31]: ")
				leia(dia)
				se(dia<1 ou dia>31){
					escreva("Data incorreta. Favor informar entre as datas 1 e 31")
				}
				escreva("\nInforme o horário do evento [0 até 23]: ")
				leia(hora)
				se(hora<0 ou hora>24){
					escreva("Horário incorreto. Favor informar entre os horário de 0 e 23")
				}
				escreva("\nObrigado. Qual evento você gostaria de adicionar? ")
				leia(agenda[hora][dia - 1])
				escreva("\nEvento adicionado com sucesso!")
				escreva("\n\nDeseja informar um novo evento? [S/N]: ")
				leia(continuar)
				
				} enquanto (continuar == 'S' ou continuar == 's')	 
	
			escreva("\nGostaria de mostrar a agenda atual? [S/N]: ")
			leia(continuar)
			se (continuar == 'S' ou continuar == 's')
			{
				limpa()
				escreva("TO DO LIST - ", nome,"\n")
				para (inteiro linha = 0; linha < 24; linha++)
				{
					para (inteiro coluna = 0; coluna < 31; coluna++)
					{
						
						se (agenda[linha][coluna] != "")
						{
							
							escreva("\n | Dia ", (coluna+1), " às ", (linha) + ":00 | :  ", agenda[linha][coluna] , " ")
						}
						
					}
				}

			}
			escreva("\nDeseja recomeçar? [S/N]: ")
			leia(continuar)
			
	
			}enquanto (continuar == 'S' ou continuar == 's')
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */