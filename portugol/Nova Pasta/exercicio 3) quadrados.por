programa {
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
		real x, y, z, w, X, Y, Z, W
		
		escreva("Informe quatro números ")
		leia(x,y,z,w)

		X = mat.potencia(x, 2)
		Y = mat.potencia(y, 2)
		Z = mat.potencia(z, 2)
		W = mat.potencia(w, 2)

		se (Z >= 100){
			escreva(Z)
		}
		senao {
			escreva( x+"²= "+X+"\n"+y+"²= "+Y+"\n"+z+"²= "+Z+"\n"+w+"²= "+W+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */