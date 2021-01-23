programa{
	inclua biblioteca Util
	
	funcao inicio(){
		const inteiro TAMANHO = 3
		inteiro cubo[TAMANHO][TAMANHO], soma=0

		para(inteiro linha=0;linha<TAMANHO;linha++){
			para(inteiro coluna=0;coluna<TAMANHO;coluna++){
				cubo[linha][coluna] = Util.sorteia(1,9)
				se(linha==coluna){
					soma+=cubo[linha][coluna]
				}
				escreva(cubo[linha][coluna]," ")
			}
			escreva("\n")
		}
		escreva("A soma da diagonal principal é ", soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */