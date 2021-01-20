programa{
	funcao inicio(){
		inteiro a,m,d,resultado1,resultado2,resultado
		

		escreva ("Informe sua idade no formato anos,meses e dias \nAno:")
		leia (a)
		escreva ("Meses: ")
		leia (m)
		escreva ("Dias: ")
		leia (d)
				
		resultado1 = a*365
		resultado2 = m*30
		resultado = resultado1 + resultado2 + d

		escreva ("Sua idade em dias é: " + resultado)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */