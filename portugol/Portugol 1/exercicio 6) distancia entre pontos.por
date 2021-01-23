programa{
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		real x1,x2,y1,y2, d,valor

		escreva ("Informe as coordenadas do primeiro ponto: ")
		leia(x1,y1)
		escreva ("Informe as coordenadas do segundo ponto: ")
		leia (x2,y2)

		valor = mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2)
		d = mat.raiz(valor,2)

		escreva ("A distância entre os pontos é: " +d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 72; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */