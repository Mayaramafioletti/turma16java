programa {
	funcao inicio(){
		inteiro a,d,m,idade

		escreva ("Informe sua idade em dias: ")
		leia (idade)

		a = idade/365
		m = (idade%365)/30
		d = (idade%365)%30

		escreva ("Sua idade é " +a+ " anos, " +m+ " meses e " +d+ " dias")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */