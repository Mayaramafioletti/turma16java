programa{
	
	inclua biblioteca Util
	
	
	funcao inicio(){
		const inteiro TAMANHOLINHA=4,TAMANHOCOLUNA=6
		inteiro n1[TAMANHOLINHA][TAMANHOCOLUNA],n2[TAMANHOLINHA][TAMANHOCOLUNA], m1[TAMANHOLINHA][TAMANHOCOLUNA],m2[TAMANHOLINHA][TAMANHOCOLUNA]
		inteiro l=0,c=0 
		
			escreva("     N1\n\n")
			para(l=0;l<TAMANHOLINHA;l++){
				para(c=0;c<TAMANHOCOLUNA;c++){
				n1[l][c]= Util.sorteia(1,9)
				escreva(n1[l][c]," ")
				}
			escreva("\n")
			}
			
			escreva("\n     N2\n\n")
			para(l=0;l<TAMANHOLINHA;l++){
				para(c=0;c<TAMANHOCOLUNA;c++){
				n2[l][c]= Util.sorteia(1,9)
				escreva(n2[l][c]," ")
				}
			escreva("\n")
			}
			
			escreva("\n     M1\n\n")
			para(l=0;l<TAMANHOLINHA;l++){
				para(c=0;c<TAMANHOCOLUNA;c++){
				m1[l][c] = n1[l][c] + n2[l][c]
				escreva(m1[l][c]," ")
				}
			escreva("\n")
			}
			escreva("\n     M2\n\n")
			para(l=0;l<TAMANHOLINHA;l++){
				para(c=0;c<TAMANHOCOLUNA;c++){
				m2[l][c] = n1[l][c] - n2[l][c]
				escreva(m2[l][c]," ")
				}
			escreva("\n")
			}
					
		}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */