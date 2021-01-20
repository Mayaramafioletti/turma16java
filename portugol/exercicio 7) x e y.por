programa{
	funcao inicio(){
		real A,B,C,D,E,F,X,Y

		escreva("Informe os 6 valores que gostaria de calcular para achar x e y: ")
		leia (A,B,C,D,E,F)

		X = (C*E-B*F)/(A*E-B*D)
		Y = (A*F-C*D)/(A*E-B*D)

		escreva ("O resultado de x é: " +X)
		escreva ("\nO resultado de y é: " +Y)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */