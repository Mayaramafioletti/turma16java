programa {
	funcao inicio(){
		inteiro seg,hora, min, tempo

		escreva ("Informe a duração do evento em segundos: ")
		leia (tempo)

		hora = tempo/3600
		min = (tempo%3600)/60
		seg = (tempo%3600)%60
		
		escreva ("O tempo do evento é de " +hora+ " horas, " +min+ " minutos e " +seg+ " segundos")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */