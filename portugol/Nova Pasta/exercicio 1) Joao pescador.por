programa {
	funcao inicio(){
		real P,E,M
		
		escreva ("Informe qual o peso de tomate: ")
		leia(P)
		
		E = P-50
		M = E*4.00

			se (E<=0){
			escreva("Parabéns João Papo-de-Pescador você não pagará multa. \nMulta=0 \nExcesso=0")
		}
			senao se(E>0){
			escreva("Você excedeu "+E+"kg, ao peso de tomate estabelecido pelo regulamento, então você pagará R$"+M)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */