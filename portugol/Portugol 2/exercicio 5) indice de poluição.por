programa{
	funcao inicio(){
		real indice

		escreva("Informe o índice de poluição: ")
		leia(indice)

		se(indice>=0.05 e indice<=0.25){
			escreva("Parabéns! O índice de poluição está aceitável")
		}
		senao se(indice>=0.3 e indice<0.4){
			escreva("Grupo 1 vocês estão sendo intimados a suspender as atividades. Índice de poluiçã: "+indice)
		}
		senao se(indice>=0.4 e indice<0.5){
			escreva("Grupo 1 e 2 vocês estão sendo intimados a suspender as atividades. Índice de poluiçã: "+indice)	
		}
		senao se(indice>=0.5){
			escreva("Todos os grupos estão sendo intimados a suspender as atividades. Índice de poluiçã: "+indice)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */