programa{
	
	funcao inicio(){
		
		inteiro hora, dia 
		cadeia agenda[24][32], nome
		caracter continua, ver

		faca{
			escreva("Bem vindo, digite seu nome: ")
			leia (nome)
	
			faca{
				escreva("Informe a data do evento [1/31]: ")
				leia(dia)
				escreva("Informe o horário do evento [0/23] ")
				leia(hora)
				escreva("Qual evento que você deseja adicionar? ")
				leia(agenda[hora][dia])
				escreva("Deseja informar outro evento? [S/N] ")
				leia(continua)
			}enquanto (continua == 'S' ou continua == 's')
			
			
			para (inteiro x= 0; x<31; x++)
		{
			para(inteiro y=0; y<24;y++)
			{
				se (agenda[y][x] != "")
				{
					escreva("\nDia :",x+1," hora: ",y," : ",agenda[y][x])	
				}
				
			}
		}	
				
				/*escreva("Deseja ver sua agenda até o momento? [S/N] ")
				leia(continua)
				se (continua == 'S' ou continua == 's'){
					para(inteiro i=0; i<24; i++){						//montar matriz
						para(inteiro j=0; j<31; j++){
							se(agenda[i][j] != ""){
								escreva ( hora,"\t", (dia),"\t", agenda[i][j],"\n")						
							}
						}
					}	
				}	*/			
	
		}enquanto(continua == 'S' ou continua =='s')
				escreva("Deseja recomeçar? [S/N]")
				leia(continua)
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */